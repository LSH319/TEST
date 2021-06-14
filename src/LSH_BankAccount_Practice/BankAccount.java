package LSH_BankAccount_Practice;

import java.util.ArrayList;

class BankAccount {
	private String name;
	private String accountId;
	private int balance = 0;
	private ArrayList<String[]> log = new ArrayList<String[]>();

	BankAccount(String name, String accountId) {
		this.name = name;
		this.accountId = accountId;
	}

	public void deposit(int amount) {
		this.balance = this.balance + amount;
		inputLog("입금", amount);
	}

	public void withdraw(int amount) {
		if (this.balance < amount) {
			System.out.println("출금액은 잔액을 넘길 수 없습니다.");
			inputLog("출금실패", 0);
		} else {
			this.balance = this.balance - amount;
			inputLog("출금", amount);
		}
	}

	public void inputLog(String input, int amount) {
		String[] asd = { input, Integer.toString(amount), Integer.toString(this.balance) };
		this.log.add(asd);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public ArrayList<String[]> getLog(){
		return this.log;
	}
}