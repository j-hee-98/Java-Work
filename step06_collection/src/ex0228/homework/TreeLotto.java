package ex0228.homework;

//import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeLotto {

//	Set<Integer> lottoSet = new TreeSet<>();
	Set<Integer> lottoSet = new TreeSet<>(Collections.reverseOrder());	// 내림차순
	
	
	Random random = new Random();
	final static int MAX_COUNT = 6;
	
	public void lottoNumbers() {
		
		while(lottoSet.size() < MAX_COUNT) {
			int num = random.nextInt(45) + 1;
			lottoSet.add(num);
		}
		System.out.print(lottoSet+" ");
	}
	
//	public void printLottoNumber() {
//		ArrayList<Integer> lottoList = new ArrayList<>(lottoSet);
//        Collections.reverse(lottoList);  // 리스트를 내림차순으로 뒤집기
//        for (Integer num : lottoList) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//	}
	
	public static void main(String[] args) {
		TreeLotto tr = new TreeLotto();
		tr.lottoNumbers();
//		tr.printLottoNumber();
	}
}
