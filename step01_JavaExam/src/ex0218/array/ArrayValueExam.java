package ex0218.array;

class ArrayValue{
	//정수형 10개 저장하는 배열선언(선언과 동시에 임의값 지정)
	
	int [] arr = new int []{1,2,3,4,5,6,7,8,9,10};

   /*printArrayvalue 메소드작성
       => 메소드 안에서 위에 선언된 배열방의 값을 출력한다.
	*/			
	public void printArrayValue() {
		int len = arr.length; // 성능면에서 변수에 할당하고 사용하는 것이 좋음
		for (int x = 0; x < len; x++) {
			System.out.println("arr["+x+"] = "+arr[x]);
		}
	}
}

/////////////////////////////////////////////////
class ArrayValueExam{
	public static void main(String args []){
        // ArrayValue에 있는 printArrayvalue메소드 호출
		ArrayValue a = new ArrayValue();
		a.printArrayValue();
	}
}