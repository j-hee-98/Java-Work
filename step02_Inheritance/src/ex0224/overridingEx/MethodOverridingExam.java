package ex0224.overridingEx;

//MethodOverridingExam.java
//이 class는 수정하지 마세요.
class SuperClass{
 	protected int intNumber;
 	protected String memberString="Sting in SuperClass";
 	
 	// 생성자
	SuperClass(){
 		System.out.println("생성자 SuperClass()가 호출되었습니다.");
 	}
 	
	public void methodZero(){
 		System.out.println("SuperClass객체의 methodZero()메소드가 호출되었습니다.");		
		System.out.println("intNumber="+intNumber+"\t"+"memberString="+memberString);
	}
 	
 	protected void methodOwn(){
 		System.out.println("SuperClass객체의 methodOwn()메소드가 호출되었습니다.");
		System.out.println("intNumber="+intNumber+"\t"+"memberString="+memberString);
 	}
 	
	int methodTwo(int i){
 		intNumber=i;
 		System.out.println("SuperClass객체의 methodTwo(int i)메소드가 호출되었습니다.");
 		System.out.println("intNumber="+intNumber+"\t"+"memberString="+memberString);
 		return intNumber;
 	}
 	
	protected String methodThree(int i, String s){
 		intNumber=i;
 		memberString=s;
 		System.out.println("SuperClass객체의 methodThree(int i, String s)메소드가 호출되었습니다.");
 		System.out.println("intNumber="+intNumber+"\t"+"memberString="+memberString);
 		return i+s;
 	}
 	
	public void methodFour(){
 		memberString="methodFour invokes methodOwn";
 		methodOwn();
 	}
}
//SubClass의 Error를 수정하고 Error의 이유를 주석으로 작성하세요.

/*overrriding의 기본조건
	리턴타입,메소드이름,인수 같아야한다
	modifier는 같거나 커야한다.
*/

class SubClass extends SuperClass{
	// 생성자
	// 자식 생성자에서는 부모의 기본 생성자를 호출 하는데
	// super()가 기본으로 들어가 잇지만 만약 부모의 기본 생성자가 없다면
	// 강제로 부모 생성자 중 하나를 첫 줄에 super(값)을 지정해줘야한다.
	SubClass(){
//		super(); // 부모의 기본생성자를 호출( 기본적으로 생략 되어있음 )
		memberString = "SubClass의 생성자가 입력한 String";
 		System.out.println("생성자 SubClass()가 호출되었습니다.");
 	}
 	
	// 부모 클래스의 mthodZero 메서드의 접근 제어자가 public이라서
	// public 보다 큰 접근 제어자를 사용해야 하기 때문에 public이라고 바꿔줘야됨
	public void methodZero(){	
	
		System.out.println("SubClass객체의 methodZero()메소드가 호출되었습니다.");
		System.out.println("intNumber="+intNumber+"\t"+"memberString="+memberString);
	}
 	
	// 리턴타입 float -> void로 변경
	// 접근 제어자 private -> protected, public
	public void methodOwn(){
		
		System.out.println("SubClass객체의 methodOwn()메소드가 호출되었습니다.");
 		System.out.println("intNumber="+intNumber+"\t"+"memberString="+memberString);
// 		return intNumber; 
 	}
 	
	// 접근 제어자 private -> 생략, protected, public 중에 하나로 수정
	// void -> int
	int methodTwo(int a){
	
 		intNumber=a;
 		System.out.println("SubClass객체의 methodTwo()메소드가 호출되었습니다.");
 		System.out.println("intNumber="+intNumber+"\t"+"memberString="+memberString);
		return intNumber; 
 	}
	
 	String methodThree(String s, int k){
		intNumber=k;
 		memberString=s;
 		System.out.println("SubClass객체의 methodThree()메소드가 호출되었습니다.");
 		System.out.println("intNumber="+intNumber+"\t"+"memberString="+memberString);
 		return memberString;
 	}
	
 	// 부모 클래스에 접근 제어자가 protected라서
 	// 
	public String methodThree(int k,String str){
	
 		intNumber=k;
 		memberString=str;
 		System.out.println("SubClass객체의 methodThree()메소드가 호출되었습니다.");
 		System.out.println("intNumber="+intNumber+"\t"+"memberString="+memberString);
 		return memberString;
 	}
 	
	// 리턴 타입 double -> void
	public void methodFour(){
	
		System.out.println("SubClass의 public double methodFour()가 호출되었습니다.");
 		memberString="methodFour invokes methodOwn";
 		methodOwn();
 	}
}

//이 class도 수정하지 마세요.
// 
public class MethodOverridingExam{
	public static void main(String [] args){
		SuperClass sp = new SuperClass();
		System.out.println("**************************************");
		SubClass sb = new SubClass();		
		System.out.println("**************************************");
	}
}					
