package ch04.sec05;

import java.util.Scanner;

public class Test00 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String user_ID = "ezen";
		String user_pass = "12345";
		
	
		while(true) {
			
			System.out.println("아이디를 입력하세요 : ");
			String input_user_ID = scanner.nextLine();
			
			if(user_ID.equals(input_user_ID)) {
				System.out.println("비밀번호를 입력하세요 : ");
				String user_passs = scanner.nextLine();
				
			if(user_pass.equals(user_passs)) {
				System.out.println("로그인되었습니다.");
				break;
			}
			else {
				System.out.println("비밀번호가 틀렸습니다.");
				return;
			}
		  }
			else {
				System.out.println("아이디가 틀렸습니다.");
				break;
			}
		}
		
	}
	
}
	
		
		
	


