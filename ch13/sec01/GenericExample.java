package ch13.sec01;

public class GenericExample {

	public static void main(String[] args) {
	
		// Box<String> box1 = new Box<>();
		
		Box<String> box1 = new Box<>();
		box1.content = "안녕하세요";
		String str = box1.content;
		System.out.println(str);

		// Box<Integer> box2 = new Box<Integer>();
		
		Box<Integer> box2 = new Box<>();
		box2.content = 100;
		Integer value = box2.content;
		System.out.println(value);
	}

}
