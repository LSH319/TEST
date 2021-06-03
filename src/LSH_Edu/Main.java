package LSH_Edu;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("¼·¾¾¿Âµµ : ");
	double temp = scan.nextDouble(); 
	Double Fahr = (temp * 1.8) + 32; //¿Âµµ º¯È¯°ø½Ä : (¼·¾¾ * 1.8) + 32
	
	System.out.println("È­¾¾¿Âµµ : " + Fahr);
  }
}
