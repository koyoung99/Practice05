package com.javaex.ex01;

public class Member {

	private String name, id;
	private int point;

	public Member(String name, String id, int point) {
		this.name = name;
		this.id = id;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public void showInfo() {
		System.out.println("회원정보: " + this.name + "(" + this.id + "), " + this.point + "점");
	}

}
