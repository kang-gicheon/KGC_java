package ch17.sec03;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamPipeLineExample {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				
		new Student("홍길동", 10),
		new Student("신용권", 20),
		new Student("유미선", 30)
				
		);

		// 방법 1
		
		/*
		Stream<Student> studentStream = list.stream();
		//중간처리(학생 객체를 점수로 매핑)
		IntStream scoreStream = studentStream.mapToInt(student -> student
												.getScore());
		// 최종정리(평균 점수)
		double avg = scoreStream.average().getAsDouble();
		
		System.out.println("평균점수 : " + avg); // 결과 출력용
		*/
		
		// 방법 2
		
		 double avg = list.stream()
		.mapToInt(Student -> Student.getScore())
		.average()
		.getAsDouble();
		
		System.out.println("평균 점수 : " + avg); 
	}

}
