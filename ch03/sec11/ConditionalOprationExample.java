package ch03.sec11;

import java.util.Scanner;

public class ConditionalOprationExample {

	public static void main(String[] args) throws Exception {
		
	 Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("q 또는 Q를 입력시 종료됩니다. ");
			System.out.print("점수를 입력하세요 : ");
			
			String score = scanner.nextLine();
				
			if ( score =="q" || score == "Q" ) {
				break;
			}
			
			
			int num = Integer.parseInt(score);

			if (num >= 90)
				
			System.out.println("등급은 A입니다");
			
			else if (num >= 80 )
				
			System.out.println("등급은 B입니다");
			
			else if (num >= 70 )
				
				System.out.println("등급은 C입니다");
			
			else if (num >= 60 )
				
				System.out.println("등급은 D입니다");
			
			else
				
			System.out.println("등급은 F입니다");
			
			
			
			}
	
			
		}

		// char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
	 
}
