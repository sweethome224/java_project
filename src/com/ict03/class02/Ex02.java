package com.ict03.class02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02 {
	public static void main(String[] args) {
		// ��¥ ���� Ŭ���� : ���� ����ϰ� �ִ� ��ǻ�� ����
		// Date Ŭ���� 
		// Calendar Ŭ����
		
		// Date Ŭ����
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy. MM. dd.  hh:mm:ss E");
		System.out.println(dateFormat.format(date));
		
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yy. M. d.  hh:mm:ss E");
		System.out.println(dateFormat2.format(date));
		
		// ��, ��, ��, ��, ��, ��, ���� �� �� ���ϱ� 
		System.out.println(date.getYear()+"�⵵ "); // Calendar.get(Calendar.YEAR) 2021 - 1900.
		
	}
}










