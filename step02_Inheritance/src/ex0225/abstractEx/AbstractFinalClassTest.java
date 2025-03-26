package ex0225.abstractEx;
//Error 를 수정하고 이유를 주석으로 처리하세요.

final class FinalClassExam{
 final int i = -999999; 
}


abstract class AbstractClassExam{
    abstract String abstractMethodExam(int i,String s);    
    final int finalMethodExam(int i, int j){ 
        return i+j;
    }
}


class Sample01 extends AbstractClassExam{
	String abstractMethodExam(int i,String s){
		System.out.println("return "+s+i);
		return s+i;
	}
	
//	int finalMethodExam(int i, int j){	// final은 재정의 할 수 없음
//		return i*j;
//	}
	
}

//class Sample02 extends FinalClassExam{  }	// final


 
 abstract class Sample03 extends AbstractClassExam{
	 String abstractMethodExam(String i, int s){	// 오버로딩해야됨 (인수의 타입만 변경해줌)
		return s+i;
	 }
	abstract String abstractMethodExam(int i,String s);    

	void sampleMethod03(){
		System.out.println("void sampleMethod03() 호출 됨");
	}
}

class AbstractFinalClassTest{
    public static void main(String args[]){
//		AbstractClassExam ace = new AbstractClassExam(); // 생성자를 생성할 수 없음
		FinalClassExam fce = new FinalClassExam();
//		fce.i=100000;   // final은 재정의 할 수 없다.
		Sample01 s01 = new Sample01();
		AbstractClassExam aceS01 = new Sample01();
		aceS01.abstractMethodExam(700,"_999");
	}
}
