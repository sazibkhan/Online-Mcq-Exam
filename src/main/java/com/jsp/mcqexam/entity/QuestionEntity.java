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
@Table(name = "question")
public class QuestionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "questionId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long questionId;

	@Column(name = "questionName")
	private String questionName;

	@Column(name = "questionAnswer")
	private String questionAnswer;

	@Column(name = "questionSetNo")
	private String questionSetNo;

	@Column(name = "activeStatus")
	private int activeStatus;

	@Column(name = "dateTime")
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

}
