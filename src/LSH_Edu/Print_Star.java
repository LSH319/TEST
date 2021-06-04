package LSH_Edu;

import java.util.Scanner;

public class Print_Star {
	void print_All() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("별표 개수 입력 : ");
		int num = scan.nextInt();
		for(int i = 0;i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
