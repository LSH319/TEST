package LSH_ClassPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

class Triangle {
	private int firstSide;
	private int secondSide;
	private int thirdSide;

	Triangle(int inputFirstNumber, int inputSecondNumber, int inputThirdNumber) {
		this.firstSide = inputFirstNumber;
		this.secondSide = inputSecondNumber;
		this.thirdSide = inputThirdNumber;
	}

	public void drawTriangle() {
		System.out.printf("Draw<%d,%d,%d>\n", this.firstSide, this.secondSide, this.thirdSide);
	}

	public int getRound() {
		return this.firstSide + this.secondSide + this.thirdSide;
	}
}

public class TriangleClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("세 변의 길이 입력");
		scanner = new Scanner(scanner.next()).useDelimiter("\\s*,\\s*");
		try {
			int inputFirstNumber = scanner.nextInt();
			int inputSecondNumber = scanner.nextInt();
			int inputThirdNumber = scanner.nextInt();
			Triangle triangle = new Triangle(inputFirstNumber, inputSecondNumber, inputThirdNumber);
			triangle.drawTriangle();
			System.out.println("삼각형 둘레의 길이 : " + triangle.getRound());
		} catch (InputMismatchException e) {
			System.out.println("입력값 오류 프로그램 종료");
		} finally {
			scanner.close();
		}
	}
}
