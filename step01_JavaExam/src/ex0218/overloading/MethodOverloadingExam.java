package ex0218.overloading;

class OverloadedMethod{
	private int i;	// 멤버필드 0
       
	public void  setOverload(int i){
		this.i = i;   // 인수로 전달된 지역변수의 값을 전역변수에 저장(할당)
	}
	
	public int getOverload(){
		return i;	// this.i 해도 된다.	
	}
	
	//setOverload를 Overloading하세요. 리턴도 하세요.
	
	public String setOverload(String i) {
		return i;
	}
	
	
	//setOverload를 또 Overloading 하세요. 또 다른 놈으로 리턴 하세요.
	public double setOverload(double i) {
		return i;
	}
	
	//setOverload를 또 또Overloading 하세요. 리턴 안해요
	public void setOverload(char i) {
		this.i = 'A';
		System.out.println("ㅎㅊ ㅅㄱ");
	}


	//getOverload를 Overloading하세요. 리턴도 하세요.
	public String getOverload(String i) {
		return i;
	}
	
	//getOverload를 또 Overloading 하세요. 또 다른 놈으로 리턴 하세요.
	public double getOverload(double i) {
		return i;
	}
	
	//getOverload를 또 또Overloading 하세요. 리턴 안해요
	public void getOverload(char i) {
		this.i = 'B';
	}
	
}

class  MethodOverloadingExam{
       
  public static void main(String [] args){
	  
     //OverloadedMethod객체에서 호출가능한  메소드들을 한번씩 호출하세요.
	  OverloadedMethod  olm = new OverloadedMethod();
	  
	  olm.setOverload(1);
	  olm.setOverload('A');
	  olm.setOverload("배고파");
	  olm.setOverload(1.1);
	  
	  olm.getOverload(2);
	  olm.getOverload('a');
	  olm.getOverload(1.0);
	  olm.getOverload("햄버거");
	}   


}

