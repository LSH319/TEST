package LSH_BankAccount_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class BankAccount{
	String Name;
	String Account;
	int balance = 0;
	
	BankAccount(String Name,String Account){
		this.Name = Name;
		this.Account = Account;
	}
	
	public void deposit(int amount) {
		this.balance = this.balance + amount;
	}
	public void withdraw(int amount) {
		if(this.balance < amount) {
			System.out.println("출금액은 잔액을 넘길 수 없습니다.");
		}
		else {
			this.balance = this.balance - amount;
		}
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getAccount() {
		return Account;
	}
	public void setAccount(String account) {
		this.Account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}

public class BankManager {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BankTask bankTask = new BankTask();
		
		ArrayList<BankAccount> bankAccount = new ArrayList<BankAccount>();
		while(true) {
			System.out.println("0.종료  \n1. 계좌개설 \n2. 입금 \n3. 출금\n4. 전 계좌 조회");
			int num = scan.nextInt();
			
			if(num == 1) {
				bankTask.makeAccount(bankAccount);
			}
			else if(num == 2) {
				bankTask.depositAndwithdrawal(bankAccount,num);
			}
			else if (num==3) {
				bankTask.depositAndwithdrawal(bankAccount,num);
			}
			else if(num==4) {
				bankTask.printAllAccount(bankAccount);
			}
			else if(num == 0) break;	
		}
		scan.close();
	}
}
