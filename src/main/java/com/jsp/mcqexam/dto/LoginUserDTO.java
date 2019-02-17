package com.jsp.mcqexam.dto;

import java.util.Date;

public class LoginUserDTO {
	private Long signUpInfoId;

	private String userName;

	private String email;

	private String password;

	private String nationalId;

	private String Phone;

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
