package com.jsp.mcqexam.daoImpl;

import java.util.List;

import org.hibernate.Session;

import com.jsp.mcqexam.dao.UserDetailsDAO;
import com.jsp.mcqexam.entity.UserDetails;
import com.jsp.mcqexam.util.HibernateUtil;

public class UserDetailsDAOImpl implements UserDetailsDAO {

	@Override
	public UserDetails saveUserDetails(UserDetails userDetails) {
		Session session = HibernateUtil.provideSession();
		session.save(userDetails);
		HibernateUtil.commitSession(session);	
		return findLastInsertedRow();
	}
	
	public UserDetails findLastInsertedRow() {
		Session session = HibernateUtil.provideSession();
		List<UserDetails> userDetailses = session.createQuery("from UserDetails").list();		
		return userDetailses.get(userDetailses.size() - 1);		
	}


}
