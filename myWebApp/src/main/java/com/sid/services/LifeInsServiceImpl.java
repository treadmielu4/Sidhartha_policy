package com.sid.services;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.sid.dao.LifeInsuranceRepo;
import com.sid.dao.RegisterRepo;
import com.sid.model.LifeInsuranceModel;


@Service
@Transactional
public class LifeInsServiceImpl {
	
	private  LifeInsuranceRepo lp;
	private RegisterRepo rp;
	
	public LifeInsServiceImpl(LifeInsuranceRepo lp)
	{
		this.lp=lp;
	}

	public void savelifeins(LifeInsuranceModel li) {
		
		lp.save(li);
		
	}
	public List<LifeInsuranceModel> findAll()
	{
		return (List<LifeInsuranceModel>) lp.findAll();
		
	}

	public List<LifeInsuranceModel> findById( int id) {
		
		return lp.findByLifeid(id);
	}
	
	

	public LifeInsuranceModel insuranceValue(LifeInsuranceModel li) {
        Date dt=new Date();
		
		String i=String.valueOf(dt.getDate());
		String j=String.valueOf(dt.getMonth());
		
		if(i.length()==1) {
			i="0"+i;
		}
		if(j.length()==1) {
			j="0"+j;
		}
			
		
		if(li.getLpolicy().equals("Max Smart Term Plan")) {
			int y=dt.getYear()+1908;
			int x=dt.getYear()+1913;
			String ldate = ""+y+"-"+j+"-"+i;
		     String mdate=""+x+"-"+j+"-"+i;
		     li.setLmaturitydate(mdate);
		     li.setLlastdate(ldate);
		     float amnt= 100000;
		     li.setLtotalamnt(amnt);
		     float a=0;
		     li.setPaid(a);
		     if(li.getLmode().equals("Monthly"))
		     {
		    	 float val=738;
		    	 li.setLpremium(val);
		    	 float n=96;
		    	 li.setLnoofpremium(n);
		     }
		     else if(li.getLmode().equals("Quaterly"))
		     {
		    	 float val=1971;
		    	 li.setLpremium(val);
		    	 float n=32;
		    	 li.setLnoofpremium(n);
		     }
		     else if(li.getLmode().equals("Semi Annually"))
		     {
		    	 float val=3874;
		    	 li.setLpremium(val);
		    	 float n=16;
		    	 li.setLnoofpremium(n);
		     }
		     else if(li.getLmode().equals("Yearly"))
		     {
		    	 float val=8387;
		    	 li.setLpremium(val);
		    	 float n=8;
		    	 li.setLnoofpremium(n);
		     }
			
		}
		else if(li.getLpolicy().equals("Bajaj Smart Protect Goal")) {
			int y=dt.getYear()+1908;
			int x=dt.getYear()+1913;
			String ldate = ""+y+"-"+j+"-"+i;
		     String mdate=""+x+"-"+j+"-"+i;
		     li.setLmaturitydate(mdate);
		     li.setLlastdate(ldate);
		     float amnt= 1000000;
		     li.setLtotalamnt(amnt);
		     float a=0;
		     li.setPaid(a);
		     if(li.getLmode().equals("Monthly"))
		     {
		    	 float val=763;
		    	 li.setLpremium(val);
		    	 float n=96;
		    	 li.setLnoofpremium(n);
		     }
		     else if(li.getLmode().equals("Quaterly"))
		     {
		    	 float val=2206;
		    	 li.setLpremium(val);
		    	 float n=32;
		    	 li.setLnoofpremium(n);
		     }
		     else if(li.getLmode().equals("Semi Annually"))
		     {
		    	 float val=4327;
		    	 li.setLpremium(val);
		    	 float n=16;
		    	 li.setLnoofpremium(n);
		     }
		     else if(li.getLmode().equals("Yearly"))
		     {
		    	 float val=8484;
		    	 li.setLpremium(val);
		    	 float n=8;
		    	 li.setLnoofpremium(n);
		     }
			
		}
		else if(li.getLpolicy().equals("ICIC iPRU iProtect Smart")) {
			int y=dt.getYear()+1908;
			int x=dt.getYear()+1913;
			String ldate = ""+y+"-"+j+"-"+i;
		     String mdate=""+x+"-"+j+"-"+i;
		     li.setLmaturitydate(mdate);
		     li.setLlastdate(ldate);
		     float amnt= 1000000;
		     li.setLtotalamnt(amnt);
		     float a=0;
		     li.setPaid(a);
		     if(li.getLmode().equals("Monthly"))
		     {
		    	 float val=1169;
		    	 li.setLpremium(val);
		    	 float n=96;
		    	 li.setLnoofpremium(n);
		     }
		     else if(li.getLmode().equals("Quaterly"))
		     {
		    	 float val=3507;
		    	 li.setLpremium(val);
		    	 float n=32;
		    	 li.setLnoofpremium(n);
		     }
		     else if(li.getLmode().equals("Semi Annually"))
		     {
		    	 float val=6931;
		    	 li.setLpremium(val);
		    	 float n=16;
		    	 li.setLnoofpremium(n);
		     }
		     else if(li.getLmode().equals("Yearly"))
		     {
		    	 float val=12690;
		    	 li.setLpremium(val);
		    	 float n=8;
		    	 li.setLnoofpremium(n);
		     }
			
		}
		return li;
	}

	public LifeInsuranceModel findByPolicy(int lno) {
		LifeInsuranceModel lm = (LifeInsuranceModel) lp.findByLno(lno);
		return lm;
	}

	

	
	
	
	

}
