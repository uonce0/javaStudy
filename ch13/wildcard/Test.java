package ch13.wildcard;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course.register(new Applicant<Person>(new Person()));
		Course.register(new Applicant<Student>(new Student()));
		Course.register(new Applicant<Worker>(new Worker()));
		
//		Course.register2(new Applicant<Person>(new Person())); //불가능.
		Course.register2(new Applicant<Student>(new Student()));
//		Course.register2(new Applicant<Worker>(new Worker())); // 불가능.
		Course.register2(new Applicant<HighStudent>(new HighStudent()));
		
		Course.register3(new Applicant<Person>(new Person()));
//		Course.register3(new Applicant<Student>(new Student())); // 불가능.
		Course.register3(new Applicant<Worker>(new Worker()));
	}

}
