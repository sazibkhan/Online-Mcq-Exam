package com.jsp.mcqexam.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answer_option")
public class AnswerOptionEntriy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "optionId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long optionId;

	@Column(name = "optionTitle")
	private String optionTitle;

	@Column(name = "optionLabel")
	private String optionLabel;

	@ManyToOne
	@JoinColumn(name = "question_id")
	private QuestionEntity questionEntity;

	public Long getOptionId() {
		return optionId;
	}

	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}

	public String getOptionTitle() {
		return optionTitle;
	}

	public void setOptionTitle(String optionTitle) {
		this.optionTitle = optionTitle;
	}

	public String getOptionLabel() {
		return optionLabel;
	}

	public void setOptionLabel(String optionLabel) {
		this.optionLabel = optionLabel;
	}

	public QuestionEntity getQuestionEntity() {
		return questionEntity;
	}

	public void setQuestionEntity(QuestionEntity questionEntity) {
		this.questionEntity = questionEntity;
	}

}
