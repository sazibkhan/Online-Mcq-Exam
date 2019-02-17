package com.jsp.mcqexam.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answer_script")
public class AnswerScriptEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "answerScriptId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long answerScriptId;

	@Column(name = "givenAnswer")
	private String givenAnswer;

	@Column(name = "setNo")
	private String setNo;

	@Column(name = "activeStatus")
	private int activeStatus;

	@Column(name = "dateTime")
	private Date dateTime;

	@ManyToOne
	@JoinColumn(name = "questionId")
	private QuestionEntity questionEntity;

	@ManyToOne
	@JoinColumn(name = "participantId")
	private ParticipantEntity participantEntity;

	public Long getAnswerScriptId() {
		return answerScriptId;
	}

	public void setAnswerScriptId(Long answerScriptId) {
		this.answerScriptId = answerScriptId;
	}

	public String getGivenAnswer() {
		return givenAnswer;
	}

	public void setGivenAnswer(String givenAnswer) {
		this.givenAnswer = givenAnswer;
	}

	public String getSetNo() {
		return setNo;
	}

	public void setSetNo(String setNo) {
		this.setNo = setNo;
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

	public QuestionEntity getQuestionEntity() {
		return questionEntity;
	}

	public void setQuestionEntity(QuestionEntity questionEntity) {
		this.questionEntity = questionEntity;
	}

	public ParticipantEntity getParticipantEntity() {
		return participantEntity;
	}

	public void setParticipantEntity(ParticipantEntity participantEntity) {
		this.participantEntity = participantEntity;
	}

}
