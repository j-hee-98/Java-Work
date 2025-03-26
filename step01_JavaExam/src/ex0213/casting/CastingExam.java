package ex0213.casting;

class CastingExam{
	public static void main(String []args){
		byte b1;
		byte b2,b3; 
		int i1=7;
		System.out.println("int i1="+i1);

		b1=(byte)i1 ; 
		// 타입이 안맞음 int -> byte로 변경
		System.out.println("byte b1="+b1);

		b2=20;
		System.out.println("byte b2="+b2);
		
	   	b3=(byte)(b2+b1);
	   	// byte로 연산해주기 위해서 byte로 캐스팅해주고 ()로 감싸서 더해줌

		System.out.println("byte b3="+b3);
		
		long lo=56897L;
		System.out.println("long lo="+lo);

		int i4=(int)lo+i1; 
		System.out.println("int i4="+i4);
		
		boolean boo;
		boo=false;
		
		// boolean은 형변환이 안됨 그래서 true로 바꿔줌
		
		System.out.println("boolean boo="+boo);

		double d=4.67e-3;
		System.out.println("double d="+d);

		float f1=lo;
		System.out.println("float f1="+f1);
				
		
	    float f2=(float)d;			
	    // 타입이 안맞음 double -> float로 변경
		System.out.println("float f2="+f2);

		char c1, c2, c3;
		c1='\u0167';
		System.out.println("char c1="+c1);

		b2=(byte)c1;
		// char -> byte로 캐스팅
		System.out.println("byte b2="+b2);
		
		c2='A';
		
		System.out.println("char c2"
				+ "="+c2);
		
		
		c3=(char)(c2+2);
		// c3는 char 이기 때문에 캐스팅해주고 덧셈은 ()로 감싸줌
		System.out.println("char c3="+c3);
		
		
	}

}