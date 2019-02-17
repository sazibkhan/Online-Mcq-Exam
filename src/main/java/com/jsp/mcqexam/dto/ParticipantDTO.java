package com.jsp.mcqexam.dto;

import java.util.Date;

public class ParticipantDTO {

	private Long participantId;
	private String participantName;
	private int participantRoll;
	private int activeStatus;
	private Date dateTime;

	

	public Long getParticipantId() {
		return participantId;
	}

	public void setParticipantId(Long participantId) {
		this.participantId = participantId;
	}

	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	public int getParticipantRoll() {
		return participantRoll;
	}

	public void setParticipantRoll(int participantRoll) {
		this.participantRoll = participantRoll;
	}

	public int getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(int activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	
}
