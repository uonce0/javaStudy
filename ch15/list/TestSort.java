package ch15.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSort {
	
	public static void main(String[] args) {
		//Sort(정렬) - String
//		{
//			List<String> listStr = new ArrayList<>();
//			listStr.add("C");
//			listStr.add("A");
//			listStr.add("D");
//			listStr.add("B");
//			System.out.println(listStr);
//			
//			Collections.sort(listStr);
//			System.out.println(listStr);
//		}
		//Sort - 사용자 정의 클래스
		{
			List<Node> listNode = new ArrayList<>();
			listNode.add(new Node(7,2));
			listNode.add(new Node(9,3));
			listNode.add(new Node(4,6));
			listNode.add(new Node(8,5));
			System.out.println(listNode);
			Collections.sort(listNode); //정렬 기준이 불명확하면 정렬 불가 -> Comparable<Node>를 통해 직접 비교
			System.out.println(listNode);
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
		public int compareTo(Node o) {
			return this.y - o.y;
		}
	}
}
