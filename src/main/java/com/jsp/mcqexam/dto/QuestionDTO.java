package com.jsp.mcqexam.dto;

import java.util.Date;
import java.util.List;

import com.jsp.mcqexam.entity.AnswerOptionEntriy;

public class QuestionDTO {

	private Long questionId;
	private String questionName;
	private String questionAnswer;
	private String questionSetNo;
	
	private List<AnswerOptionEntriy> optionEntites;

	private int activeStatus;
	private Date dateTime;

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public String getQuestionAnswer() {
		return questionAnswer;
	}

	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}

	public String getQuestionSetNo() {
		return questionSetNo;
	}

	public void setQuestionSetNo(String questionSetNo) {
		this.questionSetNo = questionSetNo;
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

	public List<AnswerOptionEntriy> getOptionEntites() {
		return optionEntites;
	}

	public void setOptionEntites(List<AnswerOptionEntriy> optionEntites) {
		this.optionEntites = optionEntites;
	}

}
