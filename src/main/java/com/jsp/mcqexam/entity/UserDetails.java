package com.jsp.mcqexam.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class  UserDetails implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "signUpInfoId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long signUpInfoId;

	@Column(name = "userName")
	private String userName;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "nationalId")
	private String nationalId;

	@Column(name = "Phone")
	private String Phone;

	@Column(name = "createDate")
	private Date createDate;

	public Long getSignUpInfoId() {
		return signUpInfoId;
	}

	public void setSignUpInfoId(Long signUpInfoId) {
		this.signUpInfoId = signUpInfoId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	
}
