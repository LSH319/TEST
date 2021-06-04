package LSH_Edu;

import java.util.Scanner;

public class Main {
  
  
  public static void main(String[] args) {
	int menu = 0;
	Temp_Change temp = new Temp_Change();
	Sum_1to100 sum = new Sum_1to100();
	Scanner scan = new Scanner(System.in);
	Times_Table times_t = new Times_Table();
	Print_Star print_s = new Print_Star();
	Cal_Score cal_s = new Cal_Score();
	SumAndAver sAnda = new SumAndAver();
	SumAndAverByArray sAndaBa = new SumAndAverByArray();
	Trans_UpperLower trans_ul = new Trans_UpperLower();
	Caesar_Cipher caesar = new Caesar_Cipher();
	SumByArray sBya = new SumByArray();
	Calculator calc = new Calculator();
	
	System.out.println("1. 온도 변환\n2. 1부터 100까지 합\n3. 구구단 출력\n4. 별표 출력\n5. 학점 계산\n6. 합계와 평균\n7. 합계와 평균2\n8. 대소문자 변경/n9. 카이사르 변환\n10. 배열을 통한 덧셈\n11. 사칙연산");
	System.out.print("메뉴선택 : ");
	menu = scan.nextInt();
	
	if (menu == 1) temp.temp_change();
	else if (menu == 2) sum.sum();
	else if (menu == 3) times_t.print_All();
	else if (menu == 4) print_s.print_All();
	else if (menu == 5) cal_s.cal_Score();
	else if (menu == 5) cal_s.cal_Score();
	else if (menu == 6) sAnda.sum_Aver();
	else if (menu == 7) sAndaBa.sumAndaver();
	else if (menu == 8) trans_ul.trans_UpperLower();
	else if (menu == 9) caesar.trans();
	else if (menu == 10) sBya.sum();
	else if (menu == 11) calc.calculator();
	
	scan.close();
	
  }
}
