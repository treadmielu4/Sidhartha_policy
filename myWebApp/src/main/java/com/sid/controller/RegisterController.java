package com.sid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sid.dao.RegisterRepo;
import com.sid.model.LifeInsuranceModel;
import com.sid.model.RegisterModel;
import com.sid.services.RegisterService;
import com.sid.services.RegisterServiceImpl;

@Controller
@SessionAttributes("User")
public class RegisterController {

	@Autowired
	RegisterRepo repo;
	@Autowired
	private RegisterServiceImpl rs;
	

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/register")

	public String register(RegisterModel model) {

		return "register";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)

	public String registeruser(@ModelAttribute("user") RegisterModel user ,@RequestParam("mobile")String mobile,ModelMap model ) {
		if(rs.findByMobile(mobile) == null)
		{
		rs.saveMyUser(user);
		return "login";
		}
		else
		{
			model.put("Message", "*Please enter another mobile no");
			return "register";
		}
		
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.POST)

	public String loginuser(@RequestParam("mobile") String mobile, @RequestParam("pass") String pass,ModelMap model) {
		if (rs.findByMobileAndPass(mobile, pass) == null) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		} else {
			model.put("User", rs.findByMobileAndPass(mobile, pass));
			model.addAttribute("User", rs.findByMobileAndPass(mobile, pass));
			return "welcome";
		}

	}
	@RequestMapping(value = "/detail")
	
	public String showUser(ModelMap model)
	{
		RegisterModel rm =(RegisterModel)model.get("User");
		model.addAttribute("User", rm);
		return "detail";
		
	}
	
	
	@RequestMapping(value="/forgotpassword")
	public String forgot() {
		
		return "forgetpassword";
	}
	
	@RequestMapping(value="/Setpassword",method = RequestMethod.POST)
	public String setPassword(@RequestParam("mobile") String mobile, @RequestParam("pass") String pass,@RequestParam("pass1") String pass1,ModelMap model) {
		if (rs.findByMobile(mobile) == null) {
			model.put("errorMessage1", "Invalid Mobile Number.Please register.");
			return "forgetpassword";
		} else {
			if(pass.equals(pass1))
			{
			RegisterModel rm=(RegisterModel) repo.findByMobile(mobile);
			rm.setPass(pass);
			rs.saveMyUser(rm);
			return "login";
			}
			else
			{
				model.put("errorMessage2", "Please make sure your passwords match.");
				return "forgetpassword";
			}
		}
		
	}
	

	

	
	
	
	
	
	
}
