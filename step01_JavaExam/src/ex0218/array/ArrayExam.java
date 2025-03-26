package ex0218.array;

class ArrayExam{
	
	//각 int,double,char,boolean ,String type별로 총 5개씩 저장하는  배열을 생성하세요
	int [] intArr = new int [5];
	double [] douArr = new double [5];
	char [] chArr = new char [5];
	boolean [] booArr = new boolean [5];
	String [] stArr = new String [5];
	

	//메소드 : printArrayValue01	
	//위의 배열들에 자동으로 초기화 된값을 출력하세요
	public void printArrayValue01() {
		
		for(int intValue: intArr) {
			System.out.print(intValue+" ");
		}
		System.out.println();
		for(double intValue: douArr) {
			System.out.print(intValue+" ");
		}
		System.out.println();
		for(char intValue: chArr) {
			System.out.print(intValue+" ");
		}
		System.out.println();
		for(boolean intValue: booArr) {
			System.out.print(intValue+" ");
		}
		System.out.println();
		for(String intValue: stArr) {
			System.out.print(intValue+" ");
		}
		
	}

	//메소드 : printArrayValue02	
	//위의 5개의 배열에서 각각 적당한 값으로 data를 할당하세요.
	public void printArrayValue02() {
		
		int [] intArr = {1,2,3,4,5};
		double [] douArr = {1.1,1.2,1.3,1.4,1.5};
		char [] chArr = {'a','b','c','d','e'};
		boolean [] booArr = {true, false, true, true, false};
		String [] stArr = {"q","2","3","4","5"};
		
		System.out.println(intArr);
		System.out.println(douArr);
		System.out.println(chArr);
		System.out.println(booArr);
		System.out.println(stArr);
	}
	
	
	//메소드 : printArrayValue03	
	//새롭게 할당된값을 출력하세요
	public void printArrayValue03() {
		this.printArrayValue01();
		
	}
	
	//메인메소드에서
	//ArrayExam의 메소드들을 순서대로 호출하세요.
	public static void main(String[] args) {
		ArrayExam ae = new ArrayExam();
		ae.printArrayValue01();
		ae.printArrayValue03();
	}
	
}