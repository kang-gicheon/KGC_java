package ch07.sec04.exam01;

public class Computer extends Calculator{

	@Override
	public double areaCirecle(double r) {
		System.out.println("computer 객체의 araCircle() 실행");
		return Math.PI * r * r;
	}
	
	

}
