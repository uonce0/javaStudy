package ch05;

public class Test {

	public static void main(String[] args) {
		int num = 10;
		String str = "123";
		String str2 = getStr();
		String str3 = "123";
		
	}
	
	public static String getStr() { //각 메소드마다 스택을 가짐.
		int num = getInt();
		String str ="456";
		return str;
	}
	
	public static int getInt() { //각 메소드마다 스택을 가짐.
		int num = 20;
		return num;
	}
}
