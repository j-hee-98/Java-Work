package ex0221.homework;

/**
 * chapter06 - 19번 문제
 * 은행 계좌 문제
 */

class Account {
	
	private int balance;
	
	private static final int MIN_BALANCE = 0;
	private static final int MAX_BALANCE = 1000000;
	
	public Account() {
		this.balance = MIN_BALANCE;
	}

	public void setBalance(int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		} 
	}
	
	public int getBalance() {
		return balance;
	}
	
}

public class Exercise19 {
	
	public static void main(String[] args) {
		
		Account ac = new Account();
		
		ac.setBalance(10000);
		System.out.println("현재 잔고: "+ac.getBalance());
		
		ac.setBalance(-100);
		System.out.println("현재 잔고: "+ac.getBalance());
		
		ac.setBalance(2000000);
		System.out.println("현재 잔고: "+ac.getBalance());
		
		ac.setBalance(300000);
		System.out.println("현재 잔고: "+ac.getBalance());
		
	}
}
