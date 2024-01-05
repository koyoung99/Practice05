package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member member1 = new Member("정우성", "jws", 50000);
		Member member2 = new Member("유재석", "yjs", 30000);
		Member member3 = new Member("이효리", "lhr", 40000);

		member1.showInfo();
		member2.showInfo();
		member3.showInfo();
	}

}
