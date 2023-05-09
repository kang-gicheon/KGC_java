package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		// find 컬렉션 생성
		
		List<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		

		// Stream을 이용한 요소 반복 처리
		
		Stream<String> stream = list.parallelStream();
		stream.forEach(name ->{
			System.out.println(name + " : " + Thread.currentThread().getName());
		});
		
	}

}
