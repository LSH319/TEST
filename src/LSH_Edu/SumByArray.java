package LSH_Edu;

import java.util.Scanner;

public class SumByArray {
	void sum() {
		Scanner scan = new Scanner(System.in);
		
		int[] input;
		int sum=0;
		
		System.out.print("입력할 숫자 개수 : ");
		int num = scan.nextInt();
		input = new int[num];
		
		for(int i = 0;i < num;i++) {
			input[i] = scan.nextInt();
		}
		
		for(int i = 0;i < num; i++) {
			sum = sum + input[i];
		}
		System.out.print("합계 : "+ sum);
	}
}
