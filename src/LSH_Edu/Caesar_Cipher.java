package LSH_Edu;

import java.util.Scanner;

public class Caesar_Cipher {
	void encryption() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열: ");
        String target = scan.nextLine();
        
        char[] cipher;
        cipher= target.toCharArray();
        
        for(int i=0; i<cipher.length; ++i){
            if(65<=cipher[i] && cipher[i]<=87){
            	cipher[i]=(char)(cipher[i]+3);
            }
            else if(88<=cipher[i] && cipher[i]<=90){
            	cipher[i]=(char)(cipher[i]-23);
            }
            else if (97<=cipher[i] && cipher[i]<=119){
            	cipher[i]=(char)(cipher[i]+3);
           	}
            else if (120<=cipher[i] && cipher[i]<=122){
            	cipher[i]=(char)(cipher[i]-23);
           	}
            else {
            	System.out.print("Not string");
            	scan.close();
            	return;
            }
        }
        
        System.out.print(cipher);
        scan.close();
	}
}
