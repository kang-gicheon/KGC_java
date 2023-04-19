package ch5.sec07;

public class MultidimensionalArrayByNewExample {

	public static void main(String[] args) {
		
		int[][] Mathscores = new int[2][3];
		
		for(int i = 0 ; i < Mathscores.length ; i++) {
			for (int k = 0 ; k < Mathscores[i].length ; k++) {
				
				System.out.println("mathscores[" + i + "][" + k + "]" +
				Mathscores[i][k]);
			}
		}
		System.out.println();
		
		Mathscores[0][0] = 80;
		Mathscores[0][1] = 83;
		Mathscores[0][2] = 85;
		Mathscores[1][0] = 86;
		Mathscores[1][1] = 90;
		Mathscores[1][2] = 92;
		
		int totalstudent = 0;
		int totalmathsum = 0;
		
		for (int i = 0 ; i < Mathscores.length ; i++) {
			
			totalstudent += Mathscores[i].length;
			for(int k = 0 ; k < Mathscores[i].length ; k++) {
				
				totalmathsum += Mathscores[i][k];
			}
			
		}
		double totalmathavg = (double) totalmathsum / totalstudent;
		System.out.println("전체 학생의 수학 평균 점수 : " + totalmathavg);
		System.out.println();
		
		int[][] englishscores = new int[2][];
		englishscores[0] = new int[2];
		englishscores[1] = new int[3];
		
		for (int i = 0 ; i < englishscores.length ; i++) {
			for (int k = 0 ; k < englishscores[i].length ; k++) {
				System.out.println("englishscores[" + i + "][" + k + "]:" +
				englishscores[i][k]);
			}
		}
		System.out.println();
		
		englishscores[0][0] = 90;
		englishscores[0][1] = 91;
		englishscores[1][0] = 92;
		englishscores[1][1] = 93;
		englishscores[1][2] = 94;
		
		totalstudent = 0;
		
		int totalenglishsum = 0;
		
		for (int i = 0 ; i < englishscores.length ; i++) {
			totalstudent += englishscores[i].length;
			for (int k = 0; k < englishscores[i].length ; k++) {
				
				totalenglishsum += englishscores[i][k];
			}
		}
		
		double totalenglishavg = (double) totalenglishsum / totalstudent;
		System.out.println("전체 학생의 영어 평균 점수 : " + totalenglishavg);
	}

}
