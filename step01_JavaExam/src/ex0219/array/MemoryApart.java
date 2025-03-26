package ex0219.array;

class MultiArray{
//정수형 2차원 배열 8*9
	int arr [][] = new int [8][9];
	
//메소드이름 :array99
	//for loop 를 사용하여 
	//배열에 곱한 (구구단)결과저장
	//배열에 결과를 꺼내출력
	public void array99() {
		
		for (int i = 0; i < 8; i ++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = (i + 2) * (j + 1);
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		// 출력만
		System.out.println("---개선된 for문---");
		for (int[] i: arr) {
			for (int j: i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}	
}
public class MemoryApart{
//main메소드에서 
//MultiArray객체의 array99메소드호출
	public static void main(String[] args) {
		MultiArray ma = new MultiArray();
		ma.array99();
	}
	
}

