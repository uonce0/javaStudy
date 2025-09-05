package ch15.set;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {
		// Set
//		{
//			// 순서 유지X
//			Set<String> set = new TreeSet<>();
//			set.add("Uplus");
//			set.add("Hello");
//			set.add("World");
//			set.add("Hello"); // 중복 허용 X
//
//			
//			System.out.println(set);
//		}
		{
			//사용자 정의 클래스
			// Set에 담기는 객체는 equals(), hashCode() 재정의해야만 중복 제거가 된다.
			//TreeSet은 비교되는 항목의 대소관계를 이용해서 트리 구조를 구성
			// 순서를 따질 수 있는 Comparable 구현 필요!
			Set<Node> set = new TreeSet<>();
			set.add(new Node(7,2));
			set.add(new Node(3,4));
			set.add(new Node(7,2)); //중복
			set.add(new Node(5,3));
			
			System.out.println(set);
		}
	}
	
	static class Node implements Comparable<Node> {
		int y, x;
		
		Node(int y, int x) {
			this.y = y;
			this.x = x;
		}

		@Override
		public String toString() {
			return "Node [y=" + y + ", x=" + x + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(x, y);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			return x == other.x && y == other.y;
		}

		@Override
		public int compareTo(Node o) {
			return this.x - o.x;
		}
		
		
	}
}
