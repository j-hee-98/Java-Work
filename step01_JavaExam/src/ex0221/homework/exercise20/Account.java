package ex0221.homework.exercise20;



public class Account {

	private String accountNumber;  // 계좌번호
	private String accountHolder;  // 계좌주
	private int balance;   // 잔액
	
	public Account(String accountNumber, String accountHolder, int balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void displayAccountInfo() {
		System.out.println("계좌 번호: " + accountNumber);
        System.out.println("계좌 이름: " + accountHolder);
        System.out.println("잔고: " + balance + "원");
	}
}
