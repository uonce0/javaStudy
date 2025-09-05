package ch07.object;

import java.util.Objects;

// 상속받지 않는 클래스에 자동으로 extends Object 추가. 
public class Person {
	int ssn;

	@Override
	public int hashCode() {
		return Objects.hash(ssn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return ssn == other.ssn;
	}

	@Override
	public String toString() {
		return "Person [ssn=" + ssn + "]";
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Person p = (Person) obj;
//		return (this.ssn == p.ssn);
//	}

}
