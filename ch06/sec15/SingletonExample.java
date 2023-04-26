package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getinStance();
		Singleton obj2 = Singleton.getinStance();

		// obj1과 obj2의 메모리 주소를 비교한다.
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다");
		}
	}

}
