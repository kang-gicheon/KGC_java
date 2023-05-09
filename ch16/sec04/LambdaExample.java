package ch16.sec04;

public class LambdaExample {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		// 실행문이 두 개 이상일 경우
		person.action((x,y) -> {
			
			double result = x + y;
			return result;
			
		});
		
		// 리터문이 하나만 있을경우(연산식)
		// person.action((x,y) -> {
		// return (x + y);
		// });

		person.action((x, y) -> (x + y));
		
		person.action((x, y) -> sum(x,y));
		
	}
	
	public static double sum(double x, double y) {
		
		return (x + y);
		
	}

}
