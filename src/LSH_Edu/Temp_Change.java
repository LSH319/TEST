package LSH_Edu;

import java.util.Scanner;

public class Temp_Change {
	void temperatureChange() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("¼·¾¾¿Âµµ : ");
		double Celsius = scan.nextDouble(); 
		double Fahrenheit  = (Celsius * 1.8) + 32; //¿Âµµ º¯È¯°ø½Ä : (¼·¾¾ * 1.8) + 32
		
		System.out.println("È­¾¾¿Âµµ : " + Fahrenheit);
		scan.close();
	}
	
}
