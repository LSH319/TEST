package LSH_Edu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		TempChange temp = new TempChange();
		Sum1to100 sum = new Sum1to100();
		TimesTable times_t = new TimesTable();
		PrintStar print_s = new PrintStar();
		CalScore cal_s = new CalScore();
		SumAndAverage sAnda = new SumAndAverage();
		SumAndAverageByArray sAndaBa = new SumAndAverageByArray();
		TransUpperLower trans_ul = new TransUpperLower();
		CaesarCipher caesar = new CaesarCipher();
		SumByArray sBya = new SumByArray();
		Calculator calc = new Calculator();

		System.out.println(
				"1. 온도 변환\n2. 1부터 100까지 합\n3. 구구단 출력\n4. 별표 출력\n5. 학점 계산\n6. 합계와 평균\n7. 합계와 평균2\n8. 대소문자 변경/n9. 카이사르 변환\n10. 배열을 통한 덧셈\n11. 사칙연산");
		System.out.print("메뉴선택 : ");
		menu = scan.nextInt();

		if (menu == 1)
			temp.temperatureChange();
		else if (menu == 2)
			sum.sum();
		else if (menu == 3)
			times_t.print_All();
		else if (menu == 4)
			print_s.print_All();
		else if (menu == 5)
			cal_s.calculationScore();
		else if (menu == 6)
			sAnda.scoreSumAndAverage();
		else if (menu == 7)
			sAndaBa.SumAndAverage();
		else if (menu == 8)
			trans_ul.transUpperLower();
		else if (menu == 9)
			caesar.encryption();
		else if (menu == 10)
			sBya.sum();
		else if (menu == 11)
			calc.calculator();

		scan.close();

	}
}
