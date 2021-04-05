package com.ict03.class02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02 {
	public static void main(String[] args) {
		// 날짜 관련 클래스 : 현재 사용하고 있는 컴퓨터 기준
		// Date 클래스 
		// Calendar 클래스
		
		// Date 클래스
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy. MM. dd.  hh:mm:ss E");
		System.out.println(dateFormat.format(date));
		
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yy. M. d.  hh:mm:ss E");
		System.out.println(dateFormat2.format(date));
		
		// 년, 월, 일, 시, 분, 초, 요일 각 각 구하기 
		System.out.println(date.getYear()+"년도 "); // Calendar.get(Calendar.YEAR) 2021 - 1900.
		
	}
}










