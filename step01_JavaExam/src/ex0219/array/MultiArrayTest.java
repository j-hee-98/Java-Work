package ex0219.array;

public class MultiArrayTest {

//	int [][] arr;
//	int arr [][] = new int [3][4];
//	int arr [][] = {
//			
//			{1,2,3,4},
//			{2,4,6,8,10},
//			{3,6}
//			
//	};

	int [][] arr = new int[3][];
	
	
	
	public void test() {
		
		// 각 행의 열의 개수를 생성
		arr[0] = new int [2];
		arr[1] = new int [] {1,2,4,8};
		arr[2] = new int [1];
		
		System.out.println("arr = "+arr);
		System.out.println("arr = "+arr[0]); // null
		System.out.println("arr = "+arr[0][0]); // NullPointerException
		
		System.out.println(arr.length); // 행의 길이
		System.out.println(arr[0].length); // 0행의 열의 길이
		
		// 공간의 값을 출력
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		new MultiArrayTest().test();
		
	}
}
