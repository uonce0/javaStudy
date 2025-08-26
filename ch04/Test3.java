package ch04;

import java.util.Arrays;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
//		//for
//		for (int i = 0; i < 5; i++) {
//			System.out.print(i);
//		}
//		System.out.println();
//		for (int i = 4; i >= 0; i--) {
//			System.out.print(i);
//		}
		
//		//foreach
//		int[] nums = {1,2,3,4,5}; //int 배열
//		
//		for (int i = 0; i < nums.length; i++) { //i는 배열의 index : 0,1,2,3,4
//			System.out.println(nums[i]);
//		}
//		for (int i : nums) { //i는 배열의 각 항목: 1,2,3,4,5 /꼭 파이썬 같네...
//			System.out.println(i);
//		}
		
		//while
//		{
//			int i = 0;
//			while(i < 5) {
//				System.out.print(i);
//				i++;
//			}
			
//			int i = 0;
//			while(true) {
//				System.out.print(i);
//				i++;
//				if(i >= 5) break;
//			}
//		}
		
		//do-while
//		{
//			int i = 0;
//			do { //무조건 한 번 실행되는 구조.
//				System.out.print(i);
//				i++;
//			}while(i < 5); //세미콜론 필수!
//		}
		
		//람다식
		List<String> names = Arrays.asList("Kim", "Lee", "Park");
		names.forEach(n -> System.out.println(n));
		names.stream()
	     .filter(n -> n.startsWith("K"))
	     .forEach(System.out::println);
	}
}
