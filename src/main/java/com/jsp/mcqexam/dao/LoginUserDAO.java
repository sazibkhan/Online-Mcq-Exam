package com.jsp.mcqexam.dao;

import com.jsp.mcqexam.entity.LoginUser;


public interface LoginUserDAO {

	public void saveLoginUser(LoginUser loginUser);

	public LoginUser findLoginUserByEamil(String email);


	


}
