package ch05;

public class Test2 {

	public static void main(String[] args) {
		//String
//		{
//			String str1 = "Hello"; //리터럴 heap 최초 생성 - 100번지, 재활용
//			String str2 = "Hello"; //리터럴 - 100번지, 재활용(공유)
//			String str3 = new String("Hello"); //new는 무조건 새로운 객체 생성 - 200번지
//			String str4 = new String("Hello"); //new는 무조건 새로운 객체 생성 - 300번지
//
//			System.out.println(str1 == str2); //true
//			System.out.println(str3 == str4); //false
//			
//			System.out.println(str1.equals(str2)); //equals() true - 객제의 내용 비교
//			System.out.println(str3.equals(str4)); //equals() true - 객제의 내용 비교
//			System.out.println(str3.equals(str1)); //equals() true - 객제의 내용 비교
//			
//		}
		
		// String 다루기
		{
//			int index = 0;
//			String str = "Hello";
//			System.out.println(str.charAt(3));
			
//			String str = "자바 프로그래밍";
//			int idx = str.indexOf("프로");
//			System.out.println(idx); //3
//			System.out.println(str.length()); //8
			
			//String 객체는 immutable. 바꿀 수 없다. -> 새로운 문자열로 받아줘야함.
			String str = "이 자바하고 저 자바하고 같은 자바야?";
			String newStr = str.replace("자바", "Java");
			System.out.println(str); //원본 String 객체는 변화 X.
			System.out.println(newStr); //String 객체에 변화를 만드는 메소드 호출은 반드시 return으로 새로운 객체를 받아야 함.
		}

	}

}
