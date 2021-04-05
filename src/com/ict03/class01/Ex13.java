package com.ict03.class01;

public class Ex13 {
	private String name = "희동이";
	private int age = 3 ;
	private String addr = "서울";
	
	// 생성자 오버로딩
	// 기본생성자 : ctrl + space bar
	public Ex13() {
		System.out.println("기본 생성자 : " + this);
	}
	
	// Source 메뉴 -
	public Ex13(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Ex13(int age ,String name) {
		this.name = name;
		this.age = age;
	}
	public Ex13(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
