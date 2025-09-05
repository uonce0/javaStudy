package ch13.inter;

public interface Rentable<P> { // 다양한 제품(Product)을 빌려주는 서비스
	P rent();
}
