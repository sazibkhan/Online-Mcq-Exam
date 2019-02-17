package com.jsp.mcqexam.daoImpl;

import org.hibernate.Session;

import com.jsp.mcqexam.dao.LoginUserDAO;
import com.jsp.mcqexam.entity.LoginUser;
import com.jsp.mcqexam.util.HibernateUtil;

public class LoginUserDAOImpl implements LoginUserDAO {

	@Override
	public void saveLoginUser(LoginUser loginUser) {
		Session session = HibernateUtil.provideSession();
		session.save(loginUser);
		HibernateUtil.commitSession(session);
	}

	@Override
	public LoginUser findLoginUserByEamil(String email) {
		Session session = HibernateUtil.provideSession();
		try {
			return  (LoginUser) session.createQuery("from LoginUser where email='" + email + "'").list().get(0);	
		}catch(Exception e) {
			return null;
		}
		
	}
}
