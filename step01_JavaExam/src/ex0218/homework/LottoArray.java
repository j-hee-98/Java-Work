package ex0218.homework;

/**
 * 실습 문제 - 배열 로또번호 문제
 * 끄음..
 */

public class LottoArray {
	
	// 번호 6개 저장할 배열
	int[] lotto = new int[6];
	int count;
	
	
	// 중복 체크 메서드 (for 문을 돌면서 확인하면 비효율적)
//	public boolean duplicate(int num, int[] lotto) {
//		int len = lotto.length;
//		for (int i = 0; i < len; i++) {
//			if (lotto[i] == num) {
//				return true;
//			}
//		}
//		return false;
//	}
	public boolean duplicate(int num) {
		
		for(int i = 0; i < count; i++) {
			if (lotto[i] == num) return false;
		}
		return true;
	}
	
	// 랜덤 로또 번호를 배열에 저장하는 메서드
	public void lottoNumbers() {
		
		while (count < 6) {
			int num = (int)(Math.random() * 45) + 1;
			if (duplicate(num)) {
				lotto[count] = num;
				count++;
			}
		}
	}
	
	// 내리차순으로 정렬하는 메서드
	public void sortLottoNum() {
		int len = lotto.length;
		int temp = 0;
		for (int i = len-1; i > 0; i--) {
			if (lotto[i] > lotto[i+1]) {
				temp = lotto[i];
				lotto[i] = lotto[i+1];
				lotto[i+1] = temp;
			}
		}
	}
	
	// 로또 번호를 출력하는 메서드
	public void printLottoNumber() {
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
	}
	
}
