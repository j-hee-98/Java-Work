package ex0221.homework.exercise20;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accounts = new Account[100];
	private static int count = 0;
	
	public static void showMenu() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
			String choice = sc.nextLine();
			
			switch(choice) {
			case "1":
				createAccount(); break;
			case "2":
				displayAllAccounts(); break;
			case "3":
				deposit(); break;
			case "4":
				withdraw(); break;
			case "5":
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
		
	}
	
	/**
	 * 계좌생성 메서드
	 */
	public static void createAccount() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");
		
		System.out.print("계좌번호: ");
		String accountNumber = sc.nextLine();
		
		System.out.print("계좌주: ");
		String accountHolder = sc.nextLine();
		
		System.out.print("초기입금액: ");
		int balance = sc.nextInt();
		
		Account newAccount = new Account(accountNumber, accountHolder, balance);
		
		if (count < 100) {
			accounts[count] = newAccount;
			count++;
			System.out.println("계좌가 생성되었습니다.");
		} else {
			System.out.println("계좌 생성에 실패했습니다.");
		}
	}
	
	/**
	 * 계좌 목록 메서드
	 */
	public static void displayAllAccounts() {
		if (count == 0) {
			System.out.println("등록된 계좌가 없습니다.");
		} else {
			System.out.println("---------");
			System.out.println("계좌목록");
			System.out.println("---------");
			for (int i = 0; i < count; i++) {
				System.out.println(accounts[i].getAccountNumber()+" "
			+accounts[i].getAccountHolder()+" "+accounts[i].getBalance());
			}
		}
	}
	
	/**
	 *  예금 메서드
	 */
	public static void deposit() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		
		Account account = getAccount();
		
		if (account != null) {
			System.out.print("예금금액: ");
			int depositAmount = sc.nextInt();
			
			if (depositAmount > 0) {
				account.setBalance(account.getBalance() + depositAmount);
			} else {
				System.out.println("잘못된 금액입니다.");
			}
		}
	}
	
	/**
	 * 출금 메서드
	 */
	public static void withdraw() {
		Scanner sc = new Scanner(System.in);
		Account account = getAccount();
		
		System.out.println("---------");
		System.out.println("출금");
		System.out.println("---------");

        if (account != null) {
        	System.out.print("출금금액: ");
        	int withdrawAmount = sc.nextInt();
        	
        	if (withdrawAmount > 0 && withdrawAmount <= account.getBalance()) {
                account.setBalance(account.getBalance() - withdrawAmount);
            } else {
                System.out.println("출금 실패: 잔고가 부족합니다.");
            }
        }
	}
	
	/**
	 * 계좌 찾기 메서드 따로 만듬
	 */
	private static Account getAccount() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계좌번호: ");
		String accountNumber = sc.nextLine();
		
		for (int i = 0; i < count; i++) {
			if (accounts[i].getAccountNumber().equals(accountNumber)) {
				return accounts[i];
			}
		}
		System.out.println("계좌를 찾을 수 없습니다.");
		return null;
	}
	
}
