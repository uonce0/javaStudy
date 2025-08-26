package ch04;

public class Test2 {

	public static void main(String[] args) {
		//switch
		// ****유의사항****
		// 1. break 생략
		// 2. default
		// 3. char type이 정수로 표현되는 경우도 고려. => 'A' == 65 동일하게 처리.
//		{
//			char grade = 'C';
//			
//			switch(grade) {
//				case 'A': System.out.println("최우수!!!"); break;
//				case 'B': System.out.println("우수!!!"); break; //break가 없으면 그 다음행까지 전부 실행(동시출력)
//					//break가 없는 경우 아래와 같이 출력.
//					//우수!!!
//					//보통!!!
//				case 'C': System.out.println("보통!!!"); break;
//				case 'D': System.out.println("별로!!!"); break;
////				case 65 : System.out.println("중복!!!"); // 'A'에 대응
//				default: System.out.println("알 수 없음.");
//			}	
//		}
		
		//switch expression
//		{
//			char grade = 'E';
//			switch(grade) { //단순히 블록의 역할.
//				case 'A', 'a' -> { //다중처리는 쉼표(,) 사용.
//					System.out.println("최우수!!!");
//				}
//				case 'B' -> {
//					System.out.println("우수!!!");
//				}
//				default -> {
//					System.out.println("알 수 없음.");
//				}
//			}
//		}
		
		//switch return (yield)
		{
			char grade = 'B';
			int result = switch(grade) { //실행. statement 같이 작동. java13부터!
				case 'A', 'a' -> { //다중처리는 쉼표(,) 사용.
					System.out.println("최우수!!!");
					yield 90;
				}
				case 'B' -> {
					System.out.println("우수!!!");
					yield 80;
				}
				default -> 50;
			};
			
			System.out.println(result);
		}
	}
}
