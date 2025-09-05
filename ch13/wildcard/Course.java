package ch13.wildcard;

public class Course {
	// 메소드가 제네릭을 가지고 있는 것이 아니라, 
	// 메소드가 T를 가지지 않고, 파라미터가 T를 가지고 있다.
	// 파라미터가 가진 T에 제한.
	public static void register(Applicant<?> applicant) { // ? -> 제약 없음.
		System.out.println(applicant.kind.getClass().getSimpleName());
	}
	
	public static void register2(Applicant<? extends Student> applicant) { // ? -> 제약 없음.
		System.out.println(applicant.kind.getClass().getSimpleName());
	}
	
	//worker와 그 상위의 것으로만 제한.
	public static void register3(Applicant<? super Worker> applicant) { // ? -> 제약 없음.
		System.out.println(applicant.kind.getClass().getSimpleName());
	}
}
