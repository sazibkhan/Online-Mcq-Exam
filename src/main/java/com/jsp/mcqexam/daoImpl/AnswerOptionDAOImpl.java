package com.jsp.mcqexam.daoImpl;

import java.util.List;

import org.hibernate.Session;

import com.jsp.mcqexam.dao.AnswerOptionDAO;
import com.jsp.mcqexam.entity.AnswerOptionEntriy;
import com.jsp.mcqexam.util.HibernateUtil;

public class AnswerOptionDAOImpl implements AnswerOptionDAO{

	@Override
	public void saveOrUpdateAnswerOption(AnswerOptionEntriy copyDtoToEntity) {
		Session session = HibernateUtil.provideSession();
		session.save(copyDtoToEntity);
		HibernateUtil.commitSession(session);
		
	}

	@Override
	public List<AnswerOptionEntriy> findAllAnswerOptions() {
		Session session = HibernateUtil.provideSession();
		List<AnswerOptionEntriy> answerScriptEntities = session.createQuery("from AnswerOptionEntriy").list();
		HibernateUtil.commitSession(session);
		return answerScriptEntities;
	}

}
