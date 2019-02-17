package com.jsp.mcqexam.dto;

import com.jsp.mcqexam.entity.QuestionEntity;

public class AnswerOptionDTO {

	private Long optionId;
	private String optionLabel;
	private String optionTitle;
	private Long questionId;
	private QuestionEntity questionEntity;

	public Long getOptionId() {
		return optionId;
	}

	public String getOptionLabel() {
		return optionLabel;
	}

	public void setOptionLabel(String optionLabel) {
		this.optionLabel = optionLabel;
	}

	public String getOptionTitle() {
		return optionTitle;
	}

	public void setOptionTitle(String optionTitle) {
		this.optionTitle = optionTitle;
	}

	public void setOptionId(Long optionId) {
		this.optionId = optionId;
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

}
