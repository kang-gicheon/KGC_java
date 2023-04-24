package ch06.sec08;

public class CalculatorExample {

	public static void main(String[] args) {
		
		
		Calculator myCalcu = new Calculator();
		
		double result1 = myCalcu.areaRectange(10);
		
		double result2 = myCalcu.areaRectange(10,20);

		System.out.println("정사각형 넓이 = " +result1);
		System.out.println("직사각형 넓이 = " +result2);
		
	}

}
