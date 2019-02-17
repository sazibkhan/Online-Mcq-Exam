package com.jsp.mcqexam.service;

import java.util.Date;

import com.jsp.mcqexam.dao.LoginUserDAO;
import com.jsp.mcqexam.dao.UserDetailsDAO;
import com.jsp.mcqexam.daoImpl.LoginUserDAOImpl;
import com.jsp.mcqexam.daoImpl.UserDetailsDAOImpl;
import com.jsp.mcqexam.dto.LoginUserDTO;
import com.jsp.mcqexam.entity.LoginUser;
import com.jsp.mcqexam.entity.UserDetails;

public class UserLoginService {
	public LoginUserDAO userLoginDAO;
	public UserDetailsDAO userDetailsDAO;
	
	public UserLoginService() {
		userLoginDAO = new LoginUserDAOImpl();
		userDetailsDAO=new UserDetailsDAOImpl();
	}

	public void saveSignUpInfo(LoginUserDTO userSignUpDTO) {
		UserDetails userDetails = userDetailsDAO.saveUserDetails(copyDtoTOEntity(userSignUpDTO));
		
		LoginUser loginUser = userLoginDtoToEntity(userSignUpDTO);
		loginUser.setUserDetails(userDetails);		
		userLoginDAO.saveLoginUser(loginUser);
	}
	
	//SignUp info
	public UserDetails copyDtoTOEntity(LoginUserDTO userSignUpDTO) {
		UserDetails signUpEntity = new UserDetails();
		signUpEntity.setUserName(userSignUpDTO.getUserName());
		signUpEntity.setEmail(userSignUpDTO.getEmail());
		signUpEntity.setPassword(userSignUpDTO.getPassword());
		signUpEntity.setNationalId(userSignUpDTO.getNationalId());
		signUpEntity.setPhone(userSignUpDTO.getPhone());
		signUpEntity.setCreateDate(new Date());
		return signUpEntity;

	}
	
	public LoginUser userLoginDtoToEntity(LoginUserDTO userSignUpDTO) {
		LoginUser userLoginEntity = new LoginUser();
		userLoginEntity.setEmail(userSignUpDTO.getEmail());
		userLoginEntity.setPassword(userSignUpDTO.getPassword());		
		return userLoginEntity;
	}

	public LoginUser findLoginUserByEamil(String email) {
		return userLoginDAO.findLoginUserByEamil(email);
	
		
	}
}
