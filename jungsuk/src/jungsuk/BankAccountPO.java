package jungsuk;

public class BankAccountPO {
	static int balance = 0;
	public static void main(String[] args) {
		deposit(10000); // deposit메소드호출
		checkMybalance(); //checkMybalance메소드호출
		
		withdraw(3000);
		checkMybalance();
		
	}
	public static int deposit(int amount) { //메소드생성
		balance += amount;
		return balance;
	}

	public static int withdraw(int amount) {//메소드생성
		balance -= amount;
		return balance;
	}
	public static int checkMybalance() {//메소드생성
		System.out.println(balance);
		return balance;
	}
}
	