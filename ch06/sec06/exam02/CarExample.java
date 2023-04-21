package ch06.sec06.exam02;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		System.out.println("제작회사 : " + myCar.compavy );
		System.out.println("모델명 : " + myCar.model );
		System.out.println("색깔 : " + myCar.color );
		System.out.println("최고속도 : " + myCar.maxSpeed );
		System.out.println("현재속도 : " + myCar.speed );
		
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);

	}

}
