package LSH_Edu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumByArray {
	void sum() {
		Scanner scan = new Scanner(System.in);

		int[] input;
		int sum = 0;

		System.out.print("숫자 개수 입력 : ");
		try {
			int length = scan.nextInt();
			input = new int[length];

			for (int i = 0; i < length; i++) {
				input[i] = scan.nextInt();
			}

			for (int i = 0; i < length; i++) {
				sum = sum + input[i];
			}
			System.out.print("합계 : " + sum);
		} catch (InputMismatchException e) {
			System.out.println("wrong value");
			return;
		} finally {
			scan.close();
		}

	}
}
