package LSH_Edu;

public class Times_Table {
	void print_All() {
		for(int i = 2;i <= 9;i++) {
			System.out.println("---"+i+"��***");
			for(int j = 1;j <= 9;j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();
		}
	}
}
