package ex0219.array.homework;

//TwoDmArrayExam.java

class TwoDmArray{
	//String을 저장하는 twoDmArray 배열선언
	String [][] twoDmArray = new String [10][];
			
	//메소드 make2DmArray
		//twoDmArray 배열에  값을 할당
	public void make2DmArray() {
	
//		for (int i = 0; i < 10; i++) {
////			System.out.println("twoDmArray ["+i+"] = new String ["+(i+1)+"]");
//		}
//		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			twoDmArray[i] = new String [i + 1]; // 각 행의 열 개수를 생성
			
			for (int j = 0; j < twoDmArray[i].length; j++) {
				twoDmArray[i][j] = (i+1)+"동 "+(j+1)+"호";
				System.out.print(twoDmArray[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	//메소드 print2DmArray
	//	twoDmArray 배열의 값을 주어진형식으로 출력
	// 공백은 먼저 넣어주고, 
	public void print2DmArray() {
		int len = twoDmArray.length;
		
		for (int j = 0; j < len; j++) {
			
			for (int k = 0; k < j; k++) {
				System.out.print("\t");
			}
			
			for (int i = j; i < len; i++) {
				System.out.print(twoDmArray[i][j]+"\t");
			}
			System.out.println();
		}
		// String space =""; 써서 해보기
//	
//		String[][] output = new String[maxRows][maxRows];
//		
//		for (int i = 0; i < maxRows; i++) {
//			for (int j = 0; j < twoDmArray[i].length; j++) {
//				output[j][i] = twoDmArray[i][j];
//			}
//		}
//		
//		for (int i = 0; i < maxRows; i++) {
//			
//			for (int j = 0; j < maxRows; j++) {
//				if (output[i][j] != null) {
//					System.out.print(output[i][j]+" ");
//				}
//			}
//			System.out.println();
//		}
	}
		
}

public class TwoDmArrayExam{
	//main메소드에서
	
		//TwoDmArray객체생성
		
		//TwoDmArray객체의 make2DmArray메소드 호출
		
		//TwoDmArray객체의 print2DmArray메소드 호출
	public static void main(String[] args) {
		TwoDmArray td = new TwoDmArray();
		td.make2DmArray();
		
		td.print2DmArray();
	}
}
