package ch15.map;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// Map
		// key, value
		//key는 중복 X, value는 중복 O -> json 형식으로 반환 용이
		Map<String,String> map = new HashMap<>();
		map.put("love", "사랑하다");
		map.put("hate", "미워하다");
		map.put("same", "같다");
		map.put("uplus", "유플러스");
		
		System.out.println(map);
		
		// key가 같으면 새로운 value로 덮어쓴다.
		map.put("love", "사랑하다2");
		System.out.println(map);
		
		// value는 같아도 된다. 아무 상관 없음. 값 제대로 추가됨.
		map.put("equal", "같다");
		System.out.println(map);
		
		// key로 value 출력
		System.out.println(map.get("hate"));
		
		// key 순회 - value 확인
		for(String key : map.keySet()) { //Set으로 만들어진 것.
			System.out.print(key);
			System.out.println(" : " + map.get(key));
		}
		// value 순회 - key 확인X -> key 확인하려면 반복문 중첩해서 돌아야됨.
		for(String value : map.values()) { // Collections (value 중복 O)
			System.out.println(value);
		}
	}

}
