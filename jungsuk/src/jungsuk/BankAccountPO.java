package jungsuk;

public class BankAccountPO {
	static int balance = 0;
	public static void main(String[] args) {
		deposit(10000); // deposit�޼ҵ�ȣ��
		checkMybalance(); //checkMybalance�޼ҵ�ȣ��
		
		withdraw(3000);
		checkMybalance();
		
	}
	public static int deposit(int amount) { //�޼ҵ����
		balance += amount;
		return balance;
	}

	public static int withdraw(int amount) {//�޼ҵ����
		balance -= amount;
		return balance;
	}
	public static int checkMybalance() {//�޼ҵ����
		System.out.println(balance);
		return balance;
	}
}
	