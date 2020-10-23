package com.sid.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sid.dao.LifeInsuranceRepo;
import com.sid.model.LifeInsuranceModel;
import com.sid.model.RegisterModel;
import com.sid.services.LifeInsServiceImpl;

@Controller
@SessionAttributes({ "User", "Life" })
public class LifeInsuranceController {

	@Autowired
	private LifeInsuranceRepo lrepo;
	@Autowired
	private LifeInsServiceImpl ls;

	@GetMapping("/lifeInsurance")
	public String life(ModelMap model) {
		return "lifeInsurance";
	}

	@RequestMapping(value = "/lifeInsurance")

	public String savelifeinsurance(@ModelAttribute("life") LifeInsuranceModel li, ModelMap model) {
		RegisterModel rm = (RegisterModel) model.get("User");
		int id = rm.getId();
		li.setLifeid(id);
		LifeInsuranceModel li1 = ls.insuranceValue(li);
		ls.savelifeins(li);
		
		return "welcome";
	}

	@RequestMapping(value = "/view")

	public String showIns(ModelMap model) {
		RegisterModel customer1 = (RegisterModel) model.get("User");
		List<LifeInsuranceModel> lm = ls.findById(customer1.getId());
	    if(lm.size()>0) {
		model.put("LifeInsuranceList", lm);
		model.addAttribute("empty1",1);
		return "viewInsurance";
	    }
	    else
	    {
	    	model.addAttribute("empty1", 0);
	    	model.addAttribute("emptymessage", "No policy Available here.Please buy one policy");
		return "viewInsurance";
	    }

	}
	
	@GetMapping(value="/edit")
	public String editpage(@Param("lno")int lno,@Param("lname") String lname,ModelMap model) {
		model.addAttribute("lno", lno);
		model.addAttribute("lname", lname);
		return "edit";
	}
	

	@RequestMapping( value="/edited")
	public String updateIns(@RequestParam("lno") int lno,@RequestParam("lnomini") String lnomini,@RequestParam("lnominireltn") String lnominireltn) {
		LifeInsuranceModel lm = (LifeInsuranceModel) ls.findByPolicy(lno);
		lm.setLnomini(lnomini);
		lm.setLnominireltn(lnominireltn);
		ls.savelifeins(lm);
		return "redirect:/view";

	}
	
	@GetMapping(value="/pay")
	public String paypage(@Param("lno")int lno,@Param("lname") String lname,@Param("lpolicy") String lpolicy,@Param("lpremium") float lpremium,ModelMap model) {
		model.addAttribute("lno", lno);
		model.addAttribute("lname", lname);
		model.addAttribute("lpolicy", lpolicy);
		model.addAttribute("lpremium", lpremium);
		return "payIns";
	}
	

	@RequestMapping( value="/paid")
	public String PaidIns(@RequestParam("lno") int lno,@RequestParam("lname") String lname,@RequestParam("lpolicy") String lpolicy,@RequestParam("lpremium") float lpremium) {
		
		LifeInsuranceModel lm = (LifeInsuranceModel) ls.findByPolicy(lno);
		float premium=lm.getLnoofpremium()-1;
		lm.setLnoofpremium(premium);
		float paid=lm.getLpremium()+lm.getPaid();
		lm.setPaid(paid);
		ls.savelifeins(lm);
		return "redirect:/view";

	}

}
