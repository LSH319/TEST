package LSH_Edu;

import java.util.Scanner;

public class Caesar_Cipher {
	void trans() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
        String input=scan.nextLine();
        
        char[] arr;
        arr= input.toCharArray();
        
        for(int i=0; i<arr.length; ++i){
            if(65<=arr[i] && arr[i]<=87){
                arr[i]=(char)(arr[i]+3);
            }
            else if(88<=arr[i] && arr[i]<=90){
                arr[i]=(char)(arr[i]-23);
            }
            else if (97<=arr[i] && arr[i]<=119){
                arr[i]=(char)(arr[i]+3);
           	}
            else if (120<=arr[i] && arr[i]<=122){
                arr[i]=(char)(arr[i]-23);
           	}
        }
        
        System.out.print(arr);
	}
}
