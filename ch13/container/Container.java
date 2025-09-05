package ch13.container;

// 다양한 클래스를 담고 싶은 요구
//public class Container {
////	String element;
////	Car element;
//	Object element; // 모든 클래스를 담을 수 있음. -> 형변환을 해줘야하는 한계.
//	
//	
//}

public class Container<T> {
//	String element;
//	Car element;
	T element;
	
	
}