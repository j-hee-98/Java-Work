package ex0220.exam;
/**
  상품으로 속성을 관리하는 개체
*/
public class Goods{
	private String code; //상품코드 null
	private String name;//상품이름  null
	private int price;//가격 0 
	private String explain;//설명 null
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	
//	public Goods(String code, String name, int price, String explain) {
//		super();
//		this.code = code;
//		this.name = name;
//		this.price = price;
//		this.explain = explain;
//	}
	
	// set, get 생성

//	public void setCode(String code) {
//		this.code = code;
//	}
//	public String getCode() {
//		return this.code;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getName() {
//		return this.name;
//	}
//	
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	public int getPrice() {
//		return this.price;
//	}
//	
//	public void setExplain(String explain) {
//		this.explain = explain;
//	}
//	public String getExplain() {
//		return this.explain;
//	}
	
	

}