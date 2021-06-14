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
		switch (menu) {
		case 1:
			temp.temperatureChange();
			break;
		case 2:
			sum.sum();
			break;
		case 3:
			times_t.print_All();
			break;
		case 4:
			print_s.print_All();
			break;
		case 5:
			cal_s.calculationScore();
			break;
		case 6:
			sAnda.scoreSumAndAverage();
			break;
		case 7:
			sAndaBa.SumAndAverage();
			break;
		case 8:
			trans_ul.transUpperLower();
			break;
		case 9:
			caesar.transEncryption();
			break;
		case 10:
			sBya.sum();
			break;
		case 11:
			calc.calculator();
			break;
		}
		scan.close();

	}
}
