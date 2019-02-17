package com.jsp.mcqexam.daoImpl;

import java.util.List;

import org.hibernate.Session;

import com.jsp.mcqexam.dao.QuestionDAO;
import com.jsp.mcqexam.entity.QuestionEntity;
import com.jsp.mcqexam.util.HibernateUtil;

public class QuestionDAOImpl implements QuestionDAO {

	@Override
	public void saveOrUpdateQuestion(QuestionEntity questionEntity) {
		Session session = HibernateUtil.provideSession();
		session.save(questionEntity);
		HibernateUtil.commitSession(session);

	}

	public List<QuestionEntity> findAllQuestions() {
		Session session = HibernateUtil.provideSession();
		List<QuestionEntity> questionEntities = session.createQuery("from QuestionEntity").list();
		return questionEntities;
	}

	
	
	@Override
	public QuestionEntity findQuestionEntityById(Long questionId) {
		Session session = HibernateUtil.provideSession();
		String sql = "form QuestionEntity where questionId=" + questionId + "";
		QuestionEntity questionEntity = (QuestionEntity) session.createQuery(sql).list().get(0);
		HibernateUtil.commitSession(session);
		return questionEntity;
	}

	@Override
	public void deleteQuestionEntity(QuestionEntity questionEntity) {
		Session session = HibernateUtil.provideSession();
		session.delete(questionEntity);
		HibernateUtil.commitSession(session);

	}

}
