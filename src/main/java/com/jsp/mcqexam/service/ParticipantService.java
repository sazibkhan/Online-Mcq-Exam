package com.jsp.mcqexam.service;

import java.util.ArrayList;
import java.util.List;

import com.jsp.mcqexam.dao.ParticipantDAO;
import com.jsp.mcqexam.daoImpl.ParticipantDAOImpl;
import com.jsp.mcqexam.dto.ParticipantDTO;
import com.jsp.mcqexam.entity.ParticipantEntity;

public class ParticipantService {

	ParticipantDAO participantDAO;

	public ParticipantService() {
		participantDAO = new ParticipantDAOImpl();
	}

	public void saveParticipant(ParticipantDTO participantDTO) {
		participantDAO.saveOrUpdateParticipant(copyDtoToEntity(participantDTO));
	}

	// Save Method
	public ParticipantEntity copyDtoToEntity(ParticipantDTO participantDTO) {
		ParticipantEntity participantEntity = new ParticipantEntity();
		participantEntity.setParticipantName(participantDTO.getParticipantName());
		participantEntity.setParticipantRoll(participantDTO.getParticipantRoll());
		participantEntity.setActiveStatus(participantDTO.getActiveStatus());
		participantEntity.setDateTime(participantDTO.getDateTime());
		return participantEntity;

	}

	public List<ParticipantDTO> findAllParticipant() {
		List<ParticipantEntity> participantEntitieList = new ArrayList<>();
		List<ParticipantDTO> participantDTOList = new ArrayList<>();
		participantEntitieList = participantDAO.findAllParticipant();

		for (ParticipantEntity participant : participantEntitieList) {
			System.out.println("mcq Queries: " + participant.getParticipantRoll());
			participantDTOList.add(copyEntityToDto(participant));
		}
		return participantDTOList;
	}

	public ParticipantDTO copyEntityToDto(ParticipantEntity participantEntity) {
		ParticipantDTO participantDTO = new ParticipantDTO();
		participantDTO.setParticipantId(participantEntity.getParticipantId());
		participantDTO.setParticipantName(participantEntity.getParticipantName());
		participantDTO.setParticipantRoll(participantEntity.getParticipantRoll());
		participantDTO.setActiveStatus(participantEntity.getActiveStatus());
		participantDTO.setDateTime(participantEntity.getDateTime());
		return participantDTO;

	}
	

}
