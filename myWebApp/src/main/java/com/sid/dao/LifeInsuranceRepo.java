package com.sid.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sid.model.LifeInsuranceModel;

@Repository
public interface LifeInsuranceRepo extends CrudRepository<LifeInsuranceModel, Integer> {
	
	List<LifeInsuranceModel> findByLifeid(int lifeid);
	
	LifeInsuranceModel findByLno(int lno);
}