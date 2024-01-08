package com.javaex.ex10;

public class Book {

	private int bookNo; // 번호
	private String title; // 제목
	private String author; // 작가
	private int StateCode; // 대여유물

	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.StateCode = 1;
	}

	public Book(int bookNo, String title, String author, int StateCode) {
		this(bookNo, title, author);
		this.StateCode = StateCode;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void rent() {
		if (this.StateCode == 1) {
			System.out.println(title + "이(가) 대여 됐습니다.");
			StateCode = 0;
		}

	}

	public void print() {
		if (this.StateCode == 0) {
			System.out.println(bookNo + " 책 제목:" + title + ", 작가:" + author + ", 대여 유무:" + "대여중");
		} else {
			System.out.println(bookNo + " 책 제목:" + title + ", 작가:" + author + ", 대여 유무:" + "재고있음");
		}
	}

}
