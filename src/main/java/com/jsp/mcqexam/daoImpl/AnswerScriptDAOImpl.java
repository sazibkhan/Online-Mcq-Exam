package com.jsp.mcqexam.daoImpl;

import java.util.List;

import org.hibernate.Session;

import com.jsp.mcqexam.dao.AnswerScriptDAO;
import com.jsp.mcqexam.entity.AnswerScriptEntity;
import com.jsp.mcqexam.util.HibernateUtil;

public class AnswerScriptDAOImpl implements AnswerScriptDAO {

	@Override
	public void saveOrUpdateAnswerScript(AnswerScriptEntity copyDtoToEntity) {
		Session session = HibernateUtil.provideSession();
		session.save(copyDtoToEntity);
		HibernateUtil.commitSession(session);

	}

	@Override
	public List<AnswerScriptEntity> findAllAnswerScript() {
		Session session = HibernateUtil.provideSession();
		List<AnswerScriptEntity> answerScriptEntities = session.createQuery("from AnswerScriptEntity").list();
		HibernateUtil.commitSession(session);
		return answerScriptEntities;
	}

}
