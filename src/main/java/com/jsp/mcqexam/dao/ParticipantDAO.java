package com.jsp.mcqexam.dao;

import java.util.List;


import com.jsp.mcqexam.entity.ParticipantEntity;

public interface ParticipantDAO {

	public void saveOrUpdateParticipant(ParticipantEntity copyDtoToEntity);
	public List<ParticipantEntity> findAllParticipant();
	
}
