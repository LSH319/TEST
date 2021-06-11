package LSH_Edu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TempChange {
	void temperatureChange() {
		Scanner scan = new Scanner(System.in);

		System.out.print("섭씨온도 : ");

		try {
			double Celsius = scan.nextDouble();
			double Fahrenheit = (Celsius * 1.8) + 32;
			System.out.println("화씨온도 : " + Fahrenheit);
		} catch (InputMismatchException e) {
			System.out.println("wrong value");
			return;
		} finally {
			scan.close();
		}
	}
}
