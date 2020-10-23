package com.sid.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="user")
public class RegisterModel implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	private String fname;
	private String dob;
	private String gender;
	private String aadhar;
	private String email;
	private String pass;
	
	@Column(unique = true)
	private String mobile;
	
	
	
	@OneToMany(
	        mappedBy = "registerModel",
	        cascade = CascadeType.PERSIST,
	        fetch = FetchType.LAZY
	    )
	private List<LifeInsuranceModel> lm;

	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public List<LifeInsuranceModel> getLm() {
		return lm;
	}
	public void setLm(List<LifeInsuranceModel> lm) {
		this.lm = lm;
		for (LifeInsuranceModel ins : lm) {
            ins.setRegisterModel(this);
        }
	}
	
	
	@Override
	public String toString() {
		return "RegisterModel [id=" + id + ", fname=" + fname + ", dob=" + dob + ", gender=" + gender + ", aadhar="
				+ aadhar + ", email=" + email + ", mobile=" + mobile + ", pass=" + pass + "]";
	}

	
	
	
}
