package LSH_BankAccount_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BankTask {
	Scanner scan = new Scanner(System.in);
	
	public void makeAccount(ArrayList<BankAccount> bankAccount) {
		
		
		System.out.println("�̸� : ");
		String Name = scan.nextLine();
		System.out.println("���¹�ȣ : ");
		String Account = scan.nextLine();
		
		bankAccount.add(new BankAccount(Name,Account));
	}
	
	public void depositAndwithdrawal(ArrayList<BankAccount> bankAccount,int menu) {
		System.out.print("���¹�ȣ �Է� : ");
		String account = scan.nextLine();
		if(account.equals("")) account = scan.nextLine();
		for(BankAccount bankaccount : bankAccount) {
			if(bankaccount.Account.equals(account)) {
				System.out.print("�ݾ� : ");
				int amount = scan.nextInt();
				if(menu == 2) bankaccount.deposit(amount);
				else if(menu == 3) bankaccount.withdraw(amount);
				return;
			}
		}
		System.out.print("���°���\n");
	}
	
	public void printAllAccount(ArrayList<BankAccount> bankAccount) {
		for(BankAccount bankaccount : bankAccount) {
			System.out.println(bankaccount.getName() + " " + bankaccount.getAccount() + " " + bankaccount.getBalance());
		}
	}
}
