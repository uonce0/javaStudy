package ch05;

public class Test3 {

	public static void main(String[] args) {
		// Array 선언
		int[] intArray;
		int intArray2[];

		// Array 선언 + 배열 상수
		int[] intArray3 = {1, 2, 3}; // 정수 3개 (heap)
		System.out.println(intArray3[0]);
		System.out.println(intArray3[1]);
		System.out.println(intArray3[2]);

		// 정수 3개 (stack)
		int a = 1;
		int b = 2;
		int c = 3;

		// 이미 선언된 배열 변수 + 배열 상수
//      intArray = {1, 2, 3}; // 오류
		intArray = new int[] {1, 2, 3 }; // 배열 선언 + 배열 상수

		// new
		intArray2 = new int[3]; // heap 에 배열 생성, 기본값으로 초기화
		System.out.println(intArray2[0]);
		System.out.println(intArray2[1]);
		System.out.println(intArray2[2]);

		// length, for 반복문
		System.out.println(intArray.length);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}
}

