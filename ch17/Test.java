package ch17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// 생성
		{
			String[] strArray = {"A","B","C"};
			Stream<String> stream = Stream.of(strArray);
		}
		{
			List<String> list = Arrays.asList("A","B","C"); //이미 collection
			Stream<String> stream = list.stream();
		}
		//변경 - distinct
//		{
//			List<String> list = Arrays.asList("A","B","C","B","C");
//			
//			Stream<String> stream = list.stream(); //생성
//			stream.forEach( a -> System.out.println(a)); //순회 출력
//			
//			Stream<String> stream2 = list.stream().distinct(); //중복 제거. 생성 - 변경.
//			stream2.forEach( a -> System.out.println(a)); //순회 출력
//		}
		//변경 - filter
//		{
//			List<Integer> list = Arrays.asList(1,2,3,4,5);
//			
//			list.stream().filter( n -> n>2).forEach( n -> System.out.println(n)); //생성-필터-순회
//			
//		}
		//결과
		{
			List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
			
			Long count = list.stream().filter( n -> n>2).count(); //생성-필터-순회
			System.out.println(count);
			//중복제거 -> 1차필터 -> 2차필터 -> 3차필터 ... => 데이터 처리
		}
	}

}
