package ch02;

public class VariableUseExample {

	public static void main(String[] args) {
	
		int hour = 3;
		int minute = 5;
		System.out.println(hour +"시간 " + minute + "분");
		
		int TotalMinute = (hour*60) + minute;
		System.out.println("총 " + TotalMinute + "분");

	}

}
