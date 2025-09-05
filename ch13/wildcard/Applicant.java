package ch13.wildcard;

// 지원자 T <=Person, Student, Worker...
public class Applicant<T> {
	T kind;
	
	public  Applicant(T kind) {
		this.kind = kind;
	}
}
