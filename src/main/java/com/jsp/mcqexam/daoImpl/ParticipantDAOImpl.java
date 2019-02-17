package com.jsp.mcqexam.daoImpl;

import java.util.List;

import org.hibernate.Session;

import com.jsp.mcqexam.dao.ParticipantDAO;
import com.jsp.mcqexam.entity.ParticipantEntity;
import com.jsp.mcqexam.util.HibernateUtil;

public class ParticipantDAOImpl implements ParticipantDAO {

	@Override
	public void saveOrUpdateParticipant(ParticipantEntity copyDtoToEntity) {
		Session session = HibernateUtil.provideSession();
		session.save(copyDtoToEntity);
		HibernateUtil.commitSession(session);

	}

	@Override
	public List<ParticipantEntity> findAllParticipant() {
		Session session = HibernateUtil.provideSession();
		List<ParticipantEntity> participantEntities = session.createQuery("from ParticipantEntity").list();
		HibernateUtil.commitSession(session);
		return participantEntities;
	}

}
