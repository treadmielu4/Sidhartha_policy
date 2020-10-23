package com.sid.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sid.model.RegisterModel;

@Repository("RegisterRepo")
public interface RegisterRepo extends CrudRepository<RegisterModel,Integer>
{
	RegisterModel findByMobileAndPass(String mobile,String pass);
	
	RegisterModel findByMobile(String mobile);
	

}
