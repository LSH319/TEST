package LSH_Edu;

import java.util.Scanner;

public class Calculator {
    int add(int a,int b) {
    	return a+b;
    }
    
    int subtract(int a, int b) {
    	if(a < b) {
    		System.out.println("Error return 0");
    		return 0;
    	}
    	return a-b;
    }
    
    int multiply(int a, int b) {
    	return a*b;
    }
    
    int divide(int a, int b) {
    	return a/b;
    }
    
    void calculator() {
    	Scanner scan = new Scanner(System.in);
    	
    	int a = scan.nextInt();
    	while(true) {
    		String oper = scan.next();
    		if(oper.equals("=")) {
    			System.out.print(a);
    			return;
    		}
    		int b = scan.nextInt();
    	
    		if(oper.equals("+")) {
    			a = add(a,b);
    		}
    		else if(oper.equals("-")) {
    			a = subtract(a,b);
    		}
    		else if(oper.equals("*")) {
    			a = multiply(a,b);
    		}
    		else if(oper.equals("/")) {
    			a = divide(a,b);
    		}
    		
    		
    	}
    	
    }
}
