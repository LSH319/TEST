package LSH_Edu;

import java.util.Scanner;

public class Main {
  
  
  public static void main(String[] args) {
	int menu = 0;
	Temp_Change temp = new Temp_Change();
	Sum_1to100 sum = new Sum_1to100();
	Scanner scan = new Scanner(System.in);
	
	System.out.println("1. 온도 변환\n2. 1부터 100까지 합");
	System.out.print("메뉴선택 : ");
	menu = scan.nextInt();
	if (menu == 1) temp.temp_change();
	else if (menu == 2) sum.sum();
  }
}
