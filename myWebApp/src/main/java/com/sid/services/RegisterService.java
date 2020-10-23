package com.sid.services;

import java.util.List;

import com.sid.model.RegisterModel;


public interface RegisterService {
	public void saveMyUser(RegisterModel rm);
	public RegisterModel findByMobileAndPass(String mobile,String pass);
	List<RegisterModel> findAll();
	public RegisterModel findByMobile(String mobile);

}
