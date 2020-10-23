package com.sid.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.beans.factory.annotation.Autowired;

import com.sun.istack.NotNull;

@Entity
@Table(name=" lifeinsurance")
public class LifeInsuranceModel implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int lno;
	
	
	@ManyToOne(targetEntity=RegisterModel.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="lifeid",referencedColumnName = "id",nullable = false,insertable = false,updatable = false)
	@Fetch(FetchMode.JOIN)
	private RegisterModel registerModel;

	private String lname;
	private int age;
	private String lreltn;
	private String ltype;
	private String lmode;
	private String lnomini;
	private String lnominireltn;
	
	private String lpolicy;
	private String llastdate;
	private String lmaturitydate;
	private Float lpremium;
	private Float lnoofpremium;
	private Float ltotalamnt;
	private Float paid; 
	private int lifeid;

	public LifeInsuranceModel() {
		
	
	}

	public int getLno() {
		return lno;
	}

	public void setLno(int lno) {
		this.lno = lno;
	}

	public RegisterModel getRegisterModel() {
		return registerModel;
	}

	public void setRegisterModel(RegisterModel registerModel) {
		this.registerModel = registerModel;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLreltn() {
		return lreltn;
	}

	public void setLreltn(String lreltn) {
		this.lreltn = lreltn;
	}

	public String getLtype() {
		return ltype;
	}

	public void setLtype(String ltype) {
		this.ltype = ltype;
	}

	public String getLpolicy() {
		return lpolicy;
	}

	public void setLpolicy(String lpolicy) {
		this.lpolicy = lpolicy;
	}

	public String getLmode() {
		return lmode;
	}

	public void setLmode(String lmode) {
		this.lmode = lmode;
	}

	public String getLnomini() {
		return lnomini;
	}

	public void setLnomini(String lnomini) {
		this.lnomini = lnomini;
	}

	public String getLnominireltn() {
		return lnominireltn;
	}

	public void setLnominireltn(String lnominireltn) {
		this.lnominireltn = lnominireltn;
	}

	public String getLlastdate() {
		return llastdate;
	}

	public void setLlastdate(String llastdate) {
		this.llastdate = llastdate;
	}

	public String getLmaturitydate() {
		return lmaturitydate;
	}

	public void setLmaturitydate(String lmaturitydate) {
		this.lmaturitydate = lmaturitydate;
	}

	public Float getLpremium() {
		return lpremium;
	}

	public void setLpremium(Float lpremium) {
		this.lpremium = lpremium;
	}

	public Float getLnoofpremium() {
		return lnoofpremium;
	}

	public float setLnoofpremium(Float lnoofpremium) {
		return this.lnoofpremium = lnoofpremium;
	}

	public Float getLtotalamnt() {
		return ltotalamnt;
	}

	public void setLtotalamnt(Float ltotalamnt) {
		this.ltotalamnt = ltotalamnt;
	}

	public Float getPaid() {
		return paid;
	}

	public void setPaid(Float paid) {
		this.paid = paid;
	}

	public int getLifeid() {
		return lifeid;
	}

	public void setLifeid(int lifeid) {
		this.lifeid = lifeid;
	}

	@Override
	public String toString() {
		return "LifeInsuranceModel [lno=" + lno + ", lname=" + lname + ", age=" + age + ", lreltn=" + lreltn
				+ ", ltype=" + ltype + ", lpolicy=" + lpolicy + ", lmode=" + lmode + ", lnomini=" + lnomini
				+ ", lnominireltn=" + lnominireltn + ", llastdate=" + llastdate + ", lmaturitydate=" + lmaturitydate
				+ ", lpremium=" + lpremium + ", lnoofpremium=" + lnoofpremium + ", ltotalamnt=" + ltotalamnt + ", paid="
				+ paid + ", lifeid=" + lifeid + "]";
	}

	



}
