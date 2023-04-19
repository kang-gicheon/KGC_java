package ch5.sec06;

public class CharAtExample {

	public static void main(String[] args) {
		// 문자열 추출
		
		String ssn = "9506242230123";
		
		char sex = ssn.charAt(6);

		switch (sex) {
		case '1' :
		
		case '3' :
			System.out.println("남자입니다.");
			break;
			
		case '2' :
			
		case '4' :
			System.out.println("여자입니다.");
			break;
		}
	}

}
