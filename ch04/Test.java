package ch04;

public class Test {

	public static void main(String[] args) {
//		// if
//		int num = 100;
//		
//		if(num != 100) { //조건문
//			System.out.println("num == 100");
//		}
//		
//		if(m()) {
//			System.out.println("m() returns true");
//		}
		
		//if-else
//		int num = 100;
//		
//		if(num<200) {
//			System.out.println("num < 200");
//		}else {
//			System.out.println("num >= 200");
//		}
		
		//if -else if -else
		int num = 350;
		
		if(num<200) { //nested(중첩) 가능
			System.out.println("num < 200");
		}else if(num < 300) {
			System.out.println("num < 300");
		}else {
			System.out.println("num >= 300");
		}
	}
	
	public static boolean m() {
		return true;
	}
}
