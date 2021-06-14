package LSH_BankAccount_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BankManager {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		BankTask bankTask = new BankTask();
		
		while (true) {
			System.out.println("0. 종료  \n1. 계좌개설 \n2. 입금 \n3. 출금\n4. 전 계좌 조회\n5. 계좌기록 조회\n6. 계좌이체");
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				bankTask.makeAccount();
				break;
			case 2:
				bankTask.depositAndWithdrawal(menu);
				break;
			case 3:
				bankTask.depositAndWithdrawal(menu);
				break;
			case 4:
				bankTask.printAllBankAccounts();
				break;
			case 5:
				bankTask.printAllLog();
				break;
			case 6:
				bankTask.bankTransfer();
				break;
			case 0:
				scanner.close();
				return;
			}

		}
	}
}
