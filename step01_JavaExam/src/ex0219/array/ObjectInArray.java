package ex0219.array;
//ObjectInArray.java

class ObjectOne{
	public int a;
}

public class ObjectInArray{
	//메인 메소드에서 
	public static void main(String[] args) {
		
		//ObjectOne 타입을 5개 까지 저장하는 배열을 선언하고
		ObjectOne [] arr = new ObjectOne [5];
		
		//5개의 ObjectOne객체를 생성하세요.
		for (int i = 0; i < arr.length; i++) {
			System.out.print("생성 전 : "+"\t");
			System.out.println(arr[i]);
			System.out.print("생성 후 : "+"\t");
			System.out.println(arr[i] = new ObjectOne());
		}
		
//		//각 객체가 갖고있는 전역변수 출력
		//각 객체의 주소값 출력
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		//각각의 ObjectOne객체가 서로 다른 a의 값을 갖도록 a의 값을 변경하세요.

		for (int i = 0; i < 5; i++) {
			int num = (int)(Math.random() * 10) + 1;
			System.out.println("arr["+i+"].a = "+num);
		}
		//각 ObjectOne 객체의 a를 출력하세요
//		System.out.println(arr[0].a);
	}
		
	
}

/**
 * String [] name = new String [17];
 * int ages [] = new int [17];
 * String address [] = new String [17];
 * 
 * 이렇게 따로 배열을 만들면 좋지 않음
 * 
 * class Stu {
 * 이름, 나이, 주소
 * 	String name;
 * 	int ages;
 * 	String address;
 * }
 * 
 * Stu st = new Stu();
 * st.name = "";
 * st.ages = 20;
 * st.address = "";
 * 
 * 클래스 자체를 배열로 만듬
 * 
 * Student stArr [] = new Student[3]; stArr(null 값)
 * 
 * stArr[0] = new Student();
 * stArr[1] = new Student();
 * 
 * stArr[0].name = "희정";
 * stArr[0].age = 20;
 * stArr[1].address = "서울;
 * 
 * stArr[0].setAge[20];
 * stArr[0].setAge
 * 
 */ 
