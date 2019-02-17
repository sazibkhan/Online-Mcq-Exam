package com.jsp.mcqexam.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ApplicationUtils {
	
	public static final SimpleDateFormat LOCAL_DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
	public static final SimpleDateFormat LOCAL_DAY_NAME_FORMAT = new SimpleDateFormat("EEEE");
	public static final SimpleDateFormat LOCAL_MONTH_NAME_FORMAT = new SimpleDateFormat("MMMM");
	public static final SimpleDateFormat LOCAL_Year_NAME_FORMAT = new SimpleDateFormat("YYYY");
	public static final SimpleDateFormat LOCAL_SHORT_DAY_NAME_FORMAT = new SimpleDateFormat("EEE");

	public static String convertDateToString(Date date) {
		return LOCAL_DATE_FORMAT.format(date);
	}

	public static String convertDateToDayName(Date date) {
		return LOCAL_DAY_NAME_FORMAT.format(date);

	}

	public static String convertDateToMonth(Date date) {
		return LOCAL_MONTH_NAME_FORMAT.format(date);
	}

	public static String convertDateToShortDayName(Date date) {
		return LOCAL_SHORT_DAY_NAME_FORMAT.format(date);
	}

	public static String convertDateToYear(Date date) {
		return LOCAL_Year_NAME_FORMAT.format(date);

	}

	public static void main(String[] args) {
		System.out.println(convertDateToString(new Date()));
		System.out.println("Day : " + convertDateToDayName(new Date()));
		System.out.println("Month : " + convertDateToMonth(new Date()));
		System.out.println("Year : " + convertDateToYear(new Date()));
		System.out.println("Date : " + convertDateToString(new Date()));
	}

}
