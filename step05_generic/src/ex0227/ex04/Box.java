package ex0227.ex04;

public class Box<T> {

	private T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	/////////////////////////////////////
	
	//일반 메소드
	public <A, B, F> B test01(A t, F f) {
		
		return null;
	}
	
}
