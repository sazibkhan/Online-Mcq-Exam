package com.jsp.mcqexam.dto;

public class ResultDTO {

	private long resultId;
	private int total_question;
	private int answered_question;
	private int mark_per_question;
	private int right;
	private int wrong;
	private int total_mark;
	private int obtained_mark;
	private int merit_position;

	public long getResultId() {
		return resultId;
	}

	public void setResultId(long resultId) {
		this.resultId = resultId;
	}

	public int getTotal_question() {
		return total_question;
	}

	public void setTotal_question(int total_question) {
		this.total_question = total_question;
	}

	public int getAnswered_question() {
		return answered_question;
	}

	public void setAnswered_question(int answered_question) {
		this.answered_question = answered_question;
	}

	public int getMark_per_question() {
		return mark_per_question;
	}

	public void setMark_per_question(int mark_per_question) {
		this.mark_per_question = mark_per_question;
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}

	public int getWrong() {
		return wrong;
	}

	public void setWrong(int wrong) {
		this.wrong = wrong;
	}

	public int getTotal_mark() {
		return total_mark;
	}

	public void setTotal_mark(int total_mark) {
		this.total_mark = total_mark;
	}

	public int getObtained_mark() {
		return obtained_mark;
	}

	public void setObtained_mark(int obtained_mark) {
		this.obtained_mark = obtained_mark;
	}

	public int getMerit_position() {
		return merit_position;
	}

	public void setMerit_position(int merit_position) {
		this.merit_position = merit_position;
	}

}
