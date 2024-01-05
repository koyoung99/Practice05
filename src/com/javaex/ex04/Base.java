package com.javaex.ex04;

public class Base {

	public void service(String string) {

		// 코드작성할것
		if (string.equals("낮")) {
			this.day(string);
		} else if (string.equals("밤")) {
			this.night(string);
		} else {
			this.afternoon(string);
		}
	}

	public void day(String day) {
		System.out.println("낮에는 열심히 수업듣자");
	}

	public void night(String night) {

		// 코드작성할것
		System.out.println("밤에는 숙면");
	}

	public void afternoon(String afternoon) {
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
	}
}
