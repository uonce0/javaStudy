package ch15.list;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestAdd {

	public static void main(String[] args) {
		// ArrayList
//		List<String> listStr = new ArrayList<>();
//		listStr.add("Hello");
//		listStr.add("World");
//		listStr.add("Java"); // "Java"는 동일 객체인데도 개수는 모두 셈.
//		listStr.add("Java");
//		listStr.add("Java");
//		
//		System.out.println(listStr.size());
//
//		//LinkedList
//		List<String> listStr2 = new LinkedList<>();
//		listStr2.add("Hello");
//		listStr2.add("World");
//		listStr2.add("Java");
//		listStr2.add("Java");
//		listStr2.add("Java");
//		
//		System.out.println(listStr2.size());
		
		//등록 성능 테스트
//		{
//			List<String> list = new ArrayList<>();
//			LocalDateTime start = LocalDateTime.now();
//			//
//			for (int i = 0; i < 100_0000; i++) {
//				list.add(new String("Hello"));
//			}
//			LocalDateTime end = LocalDateTime.now();
//			Duration d = Duration.between(start, end);
//			System.out.println(d.getNano());
//		} //129152600
		
		{
			List<String> list = new LinkedList<>();
			LocalDateTime start = LocalDateTime.now();
			//
			for (int i = 0; i < 100_0000; i++) {
				list.add(new String("Hello"));
			}
			LocalDateTime end = LocalDateTime.now();
			Duration d = Duration.between(start, end);
			System.out.println(d.getNano());
		} //179700400
		
		//중간에 삭제하는 코드도 테스트 해볼 것. -> 소요시간 ArrayList > LinkedList 결과 예상.
		
		// 삭제 성능 테스트

	}

}
