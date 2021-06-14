package LSH_ClassPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

class Triangle {
	private int first_side;
	private int second_side;
	private int third_side;

	Triangle(int first, int second, int third) {
		this.first_side = first;
		this.second_side = second;
		this.third_side = third;
	}

	void drawTriangle() {
		System.out.printf("Draw<%d,%d,%d>\n", this.first_side, this.second_side, this.third_side);
	}

	int getRound() {
		return this.first_side + this.second_side + this.third_side;
	}
}

public class TriangleClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("세 변의 길이 입력");
		scanner = new Scanner(scanner.next()).useDelimiter("\\s*,\\s*");
		try {
			int first = scanner.nextInt();
			int second = scanner.nextInt();
			int third = scanner.nextInt();
			Triangle triangle = new Triangle(first, second, third);
			triangle.drawTriangle();
			System.out.println("삼각형 둘레의 길이 : " + triangle.getRound());
		} catch (InputMismatchException e) {
			System.out.println("입력값 오류 프로그램 종료");
		} finally {
			scanner.close();
		}
	}
}
