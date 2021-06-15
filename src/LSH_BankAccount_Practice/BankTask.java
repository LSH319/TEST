package LSH_BankAccount_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BankTask {
	ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();
	private Scanner scanner = new Scanner(System.in);
	private TaskMenu taskMenu = new TaskMenu();

	public void makeAccount() {

		System.out.println("이름 : ");
		String inputName = scanner.nextLine();

		String accountId = Integer.toString(this.bankAccounts.size() + 1);
		System.out.println("당신의 계좌번호 : " + accountId);

		this.bankAccounts.add(new BankAccount(inputName, accountId));
	}

	public void depositAndWithdrawal(final int menu) {
		System.out.print("계좌번호 : ");
		String inputAccountId = scanner.nextLine();

		if (inputAccountId.equals(""))
			inputAccountId = scanner.nextLine();

		for (BankAccount bankAccount : this.bankAccounts) {
			if (bankAccount.getAccountId().equals(inputAccountId)) {
				System.out.print("금액 : ");
				int amount = scanner.nextInt();
				if (menu == taskMenu.deposit)
					bankAccount.deposit(amount);
				else if (menu == taskMenu.withdraw)
					bankAccount.withdraw(amount);
				return;
			}
		}

		System.out.print("없는 계좌번호\n");
	}

	public void printAllBankAccounts() {
		System.out.println("이름  계좌번호  잔액");
		for (BankAccount bankAccount : this.bankAccounts) {
			System.out.println(bankAccount.getName() + " " + bankAccount.getAccountId() + " " + bankAccount.getBalance());
		}
	}

	public void printAllLog() {
		System.out.print("계좌번호 : ");
		String inputAccountId = scanner.nextLine();

		if (inputAccountId.equals(""))
			inputAccountId = scanner.nextLine();

		for (BankAccount bankAccount : this.bankAccounts) {
			if (bankAccount.getAccountId().equals(inputAccountId)) {
				for (String[] log : bankAccount.getLog()) {
					System.out.printf("%s %s %s\n", log[0], log[1], log[2]);
				}
			}
		}
	}

	public void bankTransfer() {
		System.out.print("출금 계좌번호 : ");
		String inputWithdrawalBankAccountId = scanner.nextLine();

		if (inputWithdrawalBankAccountId.equals(""))
			inputWithdrawalBankAccountId = scanner.nextLine();

		for (BankAccount withdrawalBankAccount : this.bankAccounts) {
			if (withdrawalBankAccount.getAccountId().equals(inputWithdrawalBankAccountId)) {
				System.out.print("입금 계좌번호 : ");
				String inputDepositAccountId = scanner.nextLine();

				if (inputDepositAccountId.equals(""))
					inputDepositAccountId = scanner.nextLine();

				for (BankAccount depositBankAccount : this.bankAccounts) {
					if (depositBankAccount.getAccountId().equals(inputDepositAccountId)) {
						System.out.print("금액 : ");
						int amount = scanner.nextInt();
						withdrawalBankAccount.withdraw(amount);
						depositBankAccount.deposit(amount);
						return;
					}
				}
				System.out.println("계좌번호 오류");
			}
		}
	}
}