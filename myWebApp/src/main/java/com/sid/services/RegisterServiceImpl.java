package com.sid.services;

import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.sid.dao.RegisterRepo;
import com.sid.model.RegisterModel;

@Service
@Transactional
public class RegisterServiceImpl{
	
	private final RegisterRepo rp;
	
	
	public RegisterServiceImpl(RegisterRepo rp)
	{
		this.rp=rp;
	}
	
	public void saveMyUser(RegisterModel rm)
	{
		rp.save(rm);
	}
	
	public RegisterModel findByMobileAndPass(String mobile,String pass)
	{
		
		return rp.findByMobileAndPass(mobile,pass);
		
				
	}
	
	public List<RegisterModel> findAll()
	{
		return (List<RegisterModel>) rp.findAll();
		
	}
	public RegisterModel findByMobile(String mobile)
	{
		
		return rp.findByMobile(mobile);
		
				
	}


	
}
