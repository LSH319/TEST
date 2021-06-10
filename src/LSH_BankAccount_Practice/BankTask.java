package LSH_BankAccount_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BankTask {
	Scanner scan = new Scanner(System.in);
	
	public void makeAccount(ArrayList<BankAccount> bankAccount) {
		
		
		System.out.println("이름 : ");
		String Name = scan.nextLine();
		System.out.println("계좌번호 : ");
		String Account = scan.nextLine();
		
		bankAccount.add(new BankAccount(Name,Account));
	}
	
	public void depositAndwithdrawal(ArrayList<BankAccount> bankAccount,int menu) {
		System.out.print("계좌번호 : ");
		String account = scan.nextLine();
		if(account.equals("")) account = scan.nextLine();
		for(BankAccount bankaccount : bankAccount) {
			if(bankaccount.Account.equals(account)) {
				System.out.print("금액 : ");
				int amount = scan.nextInt();
				if(menu == 2) bankaccount.deposit(amount);
				else if(menu == 3) bankaccount.withdraw(amount);
				return;
			}
		}
		System.out.print("없는 계좌번호\n");
	}
	
	public void printAllAccount(ArrayList<BankAccount> bankAccount) {
		for(BankAccount bankaccount : bankAccount) {
			System.out.println(bankaccount.getName() + " " + bankaccount.getAccount() + " " + bankaccount.getBalance());
		}
	}
	
	public void printAllLog(ArrayList<BankAccount> bankAccount) {
		System.out.print("계좌번호 : ");
		String account = scan.nextLine();
		if(account.equals("")) account = scan.nextLine();
		for(BankAccount bankaccount : bankAccount) {
			if(bankaccount.Account.equals(account)) {
				for(String[] log:bankaccount.Log) {
					System.out.printf("%s %s %s\n",log[0],log[1],log[2]);
				}
			}
		}
	}
	
	public void bankTransfer(ArrayList<BankAccount> bankAccount) {
		System.out.print("출금 계좌번호 : ");
		String withdrawalaccount = scan.nextLine();
		if(withdrawalaccount.equals("")) withdrawalaccount = scan.nextLine();
		for(BankAccount withdrawalbankaccount : bankAccount) {
			if(withdrawalbankaccount.Account.equals(withdrawalaccount)) {
				System.out.print("입금 계좌번호 : ");
				String depositaccount = scan.nextLine();
				if(depositaccount.equals("")) depositaccount = scan.nextLine();
				for(BankAccount depositbankaccount : bankAccount) {
					if(depositbankaccount.Account.equals(depositaccount)) {
						System.out.print("금액 : ");
						int amount = scan.nextInt();
						withdrawalbankaccount.withdraw(amount);
						depositbankaccount.deposit(amount);
						return;
					}
				}
				System.out.println("계좌번호 오류");
			}
		}		
	}
}