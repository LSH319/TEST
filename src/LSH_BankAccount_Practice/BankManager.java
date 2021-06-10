package LSH_BankAccount_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class BankAccount{
	String Name;
	String Account;
	int balance = 0;
	ArrayList<String[]> Log = new ArrayList<String[]>();
	
	BankAccount(String Name,String Account){
		this.Name = Name;
		this.Account = Account;
	}
	
	public void deposit(int amount) {
		this.balance = this.balance + amount;
		inputLog("입금",amount);
	}
	public void withdraw(int amount) {
		if(this.balance < amount) {
			System.out.println("출금액은 잔액을 넘길 수 없습니다.");
			inputLog("출금실패",0);
		}
		else {
			this.balance = this.balance - amount;
			inputLog("출금",amount);
		}
	}
	public void inputLog(String input,int amount) {
		String[] asd = {input,Integer.toString(amount),Integer.toString(this.balance)};
		this.Log.add(asd);
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
			System.out.println("0.종료  \n1. 계좌개설 \n2. 입금 \n3. 출금\n4. 전 계좌 조회\n5. 계좌기록 조회\n6. 계좌이체");
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
			else if(num==5) {
				bankTask.printAllLog(bankAccount);
			}
			else if(num==6) {
				bankTask.bankTransfer(bankAccount);
			}
			else if(num == 0) break;	
		}
		scan.close();
	}
}
