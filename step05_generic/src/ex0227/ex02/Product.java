package ex0227.ex02;

/**
 * 상품의 정보 : 상품종료(Tv, Veidio, Audio, ...), 모델정보
 */

public class Product <K, M> {
	private K Kind;
	private M model;
	
	public K getKind() {
		return Kind;
	}
	public void setKind(K kind) {
		Kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
}
