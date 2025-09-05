package ch13.multi;

public class Product<K, M> { //알파벳 뭐든 상관 없음
	
	// 필드
	private K kind;
	private M model;
	
	// 메소드
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	

	
}
