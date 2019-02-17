package com.jsp.mcqexam.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "participant")
public class ParticipantEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "participantId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long participantId;

	@Column(name = "participantName")
	private String participantName;

	@Column(name = "participantRoll")
	private int participantRoll;

	@Column(name = "activeStatus")
	private int activeStatus;

	@Column(name = "dateTime")
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
