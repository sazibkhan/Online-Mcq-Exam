package com.jsp.mcqexam.dao;

import com.jsp.mcqexam.entity.AnswerOptionEntriy;
import java.util.List;

public interface AnswerOptionDAO{

	public void saveOrUpdateAnswerOption(AnswerOptionEntriy copyDtoToEntity);
	
	public List<AnswerOptionEntriy> findAllAnswerOptions();

}
