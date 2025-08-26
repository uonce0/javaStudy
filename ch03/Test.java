package ch03;

public class Test {

	public static void main(String[] args) {
//		// 소수점 계산
//		{
//			int apple = 1;
//			double pieceUnit = 0.1; //조각 단위 1/10
//			int number = 7; //조각 수
//			
//			double result = apple - number*pieceUnit;
//			
//			System.out.println(result); //0.29999999999999993 -> problem.
//		}
//		{
//			int apple = 1;
//			int totalPieces = apple*10; //10개의 apple
//			int number = 7; //조각 수
//			
//			int result = totalPieces - number; //10 - 7
//			
//			System.out.println(result / 10.0); //0.3
//		}
		
//		//논리 연산자
//		{
//			int num = 10;
//			boolean isEven = false;
//			
////			if( isEven == true && num++ > 5 ) System.out.println(num); // 출력 안됨.
////			if( isEven == false && num++ > 5 ) System.out.println(num); //11
//			
////			if( isEven == false & num++ > 5 ) System.out.println(num); //11
////			System.out.println(num); //11
//			
////			//한 개 짜리는 앞에서 false여도 뒤에 조건까지 확인함.
////			if( isEven == true & num++ > 5 ) System.out.println(num); //출력 안됨.
////			System.out.println(num); //11
//			
//			//2개짜리는 앞에서 false로 판명이 나면 뒤에 조건은 확인하지 않음.
//			if( isEven == true && num++ > 5 ) System.out.println(num); //출력 안됨.
//			System.out.println(num); //10
//		}
		
//		// 삼항 연산자
//		{
//			int score = 75;
////			char grade = (score > 90) ? 'A' : 'B'; //2분류
//			char grade = (score > 90) ? 'A' : (score > 80 ? 'B' : 'C'); //3분류
//			System.out.println(grade);
//		}
//
		//bit 수 표현
		System.out.println(Integer.toBinaryString(9));
		System.out.println(Integer.toBinaryString(-128));
		System.out.println(Integer.toBinaryString(-1));
		System.out.println(Integer.toBinaryString(-119));
		/*
		000000000000000000000000 00001001
		111111111111111111111111 10000000
		111111111111111111111111 11111111
		111111111111111111111111 10001001
		 */
	}
}
