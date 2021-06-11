package LSH_Edu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalScore {
	void calculationScore() {
		Scanner scan = new Scanner(System.in);

		System.out.print("점수 :  ");
		try {
			int score = scan.nextInt();

			System.out.print("학점 : ");
			if (score >= 90)
				System.out.print("A");
			else if (score >= 80)
				System.out.print("B");
			else if (score >= 70)
				System.out.print("C");
			else if (score >= 60)
				System.out.print("D");
			else
				System.out.print("F");
		} catch (InputMismatchException e) {
			System.out.println("wrong value");
			return;
		} finally {
			scan.close();
		}
	}
}
