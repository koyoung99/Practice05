package com.javaex.ex08;

public class Account {

	private String accountNo;
	private int balance;

	// 생성자 작성
	public Account(String accountNO) {
		this.accountNo = accountNO;
		System.out.println(this.accountNo + " 계좌가 개설되었습니다.");
	}

	// 필요한 메소드 작성
	public Account(String accountNo, int balance) {
		this(accountNo);
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) {
		balance -= money;
	}

	public void showBalance() {
		System.out.println(balance);

	}

}
