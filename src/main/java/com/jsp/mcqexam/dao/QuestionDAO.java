package com.jsp.mcqexam.dao;

import java.util.List;

import com.jsp.mcqexam.entity.QuestionEntity;

public interface QuestionDAO {

	public void saveOrUpdateQuestion(QuestionEntity questionEntity);
	public List<QuestionEntity> findAllQuestions();

	public QuestionEntity findQuestionEntityById(Long questionId);

	public void deleteQuestionEntity(QuestionEntity questionEntity);

}
