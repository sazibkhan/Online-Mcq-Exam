package com.jsp.mcqexam.dto;

import java.util.Date;

import com.jsp.mcqexam.entity.ParticipantEntity;
import com.jsp.mcqexam.entity.QuestionEntity;

public class AnswerScriptDTO {

	private Long answerScriptId;
	private String givenAnswer;
	private String setNo;
	private int activeStatus;
	private Date dateTime;

	private Long questionId;
	private QuestionEntity questionEntity;

	private Long participantId;
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

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public QuestionEntity getQuestionEntity() {
		return questionEntity;
	}

	public void setQuestionEntity(QuestionEntity questionEntity) {
		this.questionEntity = questionEntity;
	}

	public Long getParticipantId() {
		return participantId;
	}

	public void setParticipantId(Long participantId) {
		this.participantId = participantId;
	}

	public ParticipantEntity getParticipantEntity() {
		return participantEntity;
	}

	public void setParticipantEntity(ParticipantEntity participantEntity) {
		this.participantEntity = participantEntity;
	}

}
