package LSH_Edu;

import java.util.Scanner;

public class Trans_UpperLower {
	void trans_UpperLower() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
        String input=scan.nextLine();
        
        char[] arr;
        arr= input.toCharArray();
        
        for(int i=0; i<arr.length; ++i){
            if(65<=arr[i] && arr[i]<=90){
                arr[i]=(char)(arr[i]+32);
            }
            else if (97<=arr[i] && arr[i]<=122){
                arr[i]=(char)(arr[i]-32);
           	}
        }
        
        System.out.print(arr);
	}
}
