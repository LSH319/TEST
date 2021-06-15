package LSH_BankAccount_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BankTask {
	Map<String, BankAccount> bankAccounts = new HashMap<>();
	private Scanner scanner = new Scanner(System.in);
	private TaskMenu taskMenu = new TaskMenu();

	public void makeAccount() {

		System.out.println("이름 : ");
		String inputName = scanner.nextLine();

		String accountId = Integer.toString(this.bankAccounts.size() + 1);
		System.out.println("당신의 계좌번호 : " + accountId);

		this.bankAccounts.put(accountId, new BankAccount(inputName));
	}

	public void depositAndWithdrawal(final int menu) {
		System.out.print("계좌번호 : ");
		String inputAccountId = scanner.nextLine();

		if (inputAccountId.equals(""))
			inputAccountId = scanner.nextLine();

		if (!this.bankAccounts.containsKey(inputAccountId)) {
			System.out.print("계좌번호 오류\n");
			return;
		}

		BankAccount bankAccount = this.bankAccounts.get(inputAccountId);
		System.out.print("금액 : ");
		int amount = scanner.nextInt();
		if (menu == taskMenu.deposit)
			bankAccount.deposit(amount);
		else if (menu == taskMenu.withdraw)
			bankAccount.withdraw(amount);
	}

	public void printAllBankAccounts() {
		System.out.println("이름  계좌번호  잔액");
		Set<String> accountIds = this.bankAccounts.keySet();
		for (String accountId : accountIds) {
			System.out.println(this.bankAccounts.get(accountId).getName() + " " + accountId + " "
					+ this.bankAccounts.get(accountId).getBalance());
		}
	}

	public void printAllLog() {
		System.out.print("계좌번호 : ");
		String inputAccountId = scanner.nextLine();

		if (inputAccountId.equals(""))
			inputAccountId = scanner.nextLine();

		if (!bankAccounts.containsKey(inputAccountId)) {
			System.out.print("계좌번호 오류\n");
			return;
		}

		for (String[] accountLog : bankAccounts.get(inputAccountId).getLog()) {
			System.out.printf("%s %s %s\n", accountLog[0], accountLog[1], accountLog[2]);
		}
	}

	public void bankTransfer() {
		System.out.print("출금 계좌번호 : ");
		String inputWithdrawalBankAccountId = scanner.nextLine();
		if (inputWithdrawalBankAccountId.equals(""))
			inputWithdrawalBankAccountId = scanner.nextLine();
		if (!bankAccounts.containsKey(inputWithdrawalBankAccountId)) {
			System.out.print("출금 계좌번호 오류\n");
			return;
		}

		System.out.print("입금 계좌번호 : ");
		String inputDepositAccountId = scanner.nextLine();
		if (inputDepositAccountId.equals(""))
			inputDepositAccountId = scanner.nextLine();
		if (!bankAccounts.containsKey(inputDepositAccountId)) {
			System.out.print("입금 계좌번호 오류\n");
			return;
		}

		System.out.print("금액 : ");
		int amount = scanner.nextInt();
		bankAccounts.get(inputWithdrawalBankAccountId).withdraw(amount);
		if (bankAccounts.get(inputWithdrawalBankAccountId).getBalance() > amount)
			bankAccounts.get(inputDepositAccountId).deposit(amount);
	}
}