package ex0220.exam;
public class  StartView{
	public static void main(String[] args) {
       String [][] data = new String [][]{
                     {"A01" , "새우깡" , "2500" , "짜고 맛나다."},  //---> Goods 
                     {"A02" , "고구마깡" , "3500" , "고구맛이고 달다."},  //---> Goods 
                     {"A03" , "감자깡" , "5000" , "감자맛에 고소한맛."}, // ---> Goods 
					 {"A04" , "허니버터칩" , "2200" , "달콤 하다."},
                     {"A05" , "콘칩" , "3000" , "고소하다."}
                     
                };

		System.out.println("***** 프로그램 시작합니다. ********************");

       MenuView mv  = new MenuView();//전역변수 초기화
	   mv.printMenu( data );
	}
}

/**
 * 삭제
 * 
 * - 사용자가 삭제하고자 하는 코드를 입력하면 그 코드에 해당하는 인덱스 값을 먼저 찾아야된다.
 * - 중간에 null 값이 존재하기 때문에 인접해 있는 주소 값을 땡겨와야됨
 * 
 */
