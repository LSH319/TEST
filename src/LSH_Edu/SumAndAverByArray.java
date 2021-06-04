package LSH_Edu;

public class SumAndAverByArray {
	void sumAndaver() {
		int[][] score = {{90,80,80},{85,85,95},{95,70,75},{80,80,90},{90,75,80}};
		for(int i= 0;i < 5;i++) {
			int sum=0;
			for(int j = 0;j < 3;j++) {
				sum = sum + score[i][j];
			}
			System.out.printf("ID=%d : ÇÕ°è=%d Æò±Õ=%f\n",i,sum,(double)sum/3);
		}
	}
}
