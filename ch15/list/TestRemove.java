package ch15.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestRemove {

	public static void main(String[] args) {
		// ArrayList
//		{
//			List<String> listStr = new ArrayList<>();
//			listStr.add("Hello");
//			listStr.add("World");
//			listStr.add("Java");
//			
//			// 순회
//			for (int i = 0; i < listStr.size(); i++) {
//				System.out.println(listStr.get(i));
//			}
//			
//			listStr.remove(0); //index
//			listStr.remove("Java"); //Object
//			
//			for (int i = 0; i < listStr.size(); i++) {
//				System.out.println(listStr.get(i));
//			}
//			
//	//		System.out.println(listStr.size());
//		}
		
		// 순회 중 삭제
		{
			List<String> listStr = new ArrayList<>();
			listStr.add("Hello");
			listStr.add("World");
			listStr.add("World");
			listStr.add("Java");
			
			// 순회
			// List는 remove가 되면 inex 조정 4-> 3
			// World는 원래 index가 2->1로 변경.
			//i==2 원래 World 였는데 Java를 가리킨다.
//			for (int i = 0; i < listStr.size(); i++) {
//				if (listStr.get(i).equals("World")) {
//					listStr.remove(i); //index
//				}
//			}
//			

			
			//순회 중 삭제
			// 1. 뒤부터 삭제
//			for (int i = listStr.size()-1; i >= 0 ; i--) {
//				if (listStr.get(i).equals("World")) {
//					listStr.remove(i); //index
//				}
//			}
			
			// 2. Iterable -추천: 살짝 느림..
			Iterator<String> itr = listStr.iterator();
			while(itr.hasNext()) {
				String str = itr.next();
				if ( str.equals("World")) {
					itr.remove();
				}
			}
			for (int i = 0; i < listStr.size(); i++) {
				System.out.println(listStr.get(i));
			}
		}
		
		
		
	}

}
