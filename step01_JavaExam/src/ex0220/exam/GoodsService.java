package ex0220.exam;
/**
  각 요청에 대한 로직(기능)을 담당할 클래스
  (등록 , 전체검색, 부분검색, 수정, 삭제 등등.....)
*/
public class GoodsService{

	//상품을 관리할 배열 선언
	private Goods [] goodsArr = new Goods [10];
	public static int count;//0 배열방에 저장 객체의 개수 



   /**
      초기 치 데이터를 세팅하는 메소드
	  String [][] data = new String [][]{
			 {"A01" , "새우깡" , "2500" , "짜고 맛나다."},  //---> Goods 
			 {"A02" , "고구마깡" , "3500" , "고구맛이고 달다."},  //---> Goods 
			 {"A03" , "감자깡" , "5000" , "감자맛에 고소한맛."}, // ---> Goods 
			 {"A04" , "허니버터칩" , "2200" , "달콤 하다."},
			 {"A05" , "콘칩" , "3000" , "고소하다."}
			 
		};
	2차원 data의 data[0]의 값을 하나의 데이터로 뽑아서 사용
	goodsArr 배열에 넣어야 되서 for 문 돌려서 넣다
   */
   public void init(String [][] data){
	   
	   for(int i = 0; i < data.length; i++) {
			  Goods g = this.create(data[i]);
			  goodsArr[count++] = g;
		  }
	   
   }//메소드 끝


   /**
      Goods를 생성해서 값을 설정하고 생성된 Goos를 리턴하는 메소드
      Goods의 객체 생성하고 객체의 setter를 가져와서 row의 [] 부터 하나씩 값을 넣어서 리턴 
   */
   private Goods create(String [] row) {//{"A01" , "새우깡" , "2500" , "짜고 맛나다."}
	   
	   Goods g =new Goods();
	   
	   g.setCode(row[0]);
	   g.setName(row[1]);
	   g.setPrice(Integer.parseInt(row[2]));
	   g.setExplain(row[3]);
	   
	   return g;
	   
   }

   /**
     등록(등록실패 - 중복인경우, 배열의 길이 벗어난경우)
	 @return : 
			 0이면 상품코드 중복 ,
			 1이면 등록성공, 
			 -1이면 배열의 길이 벗어남
   */
   public int insert(Goods goods){

	   // 배열의 길이 체크
	   

	   //중복체크 
	 

	  
      return 0;
   }


   /**
     전체검색
   */
   public Goods[] selectAll(){
     
      return goodsArr;
      
      
   }

   /**
     상품코드에 해당하는 상품 검색
	 @return : 만약 code에 해당하는 값이 있으면 Goods를 리턴하고
	           없으면 null 리턴
   */
   public Goods selectByCode(String code){
       
       
       return null;
   }


   /**
    상품코드에 해당하는 가격, 설명 수정하기 
	@return : true이면 수정완료, false이면 수정실패
   */
   public boolean update(Goods goods){ //수정하려는 코드, 변경값 - 가격, 설명
      
       return false;
   }
   
   /**
    * 상품코드에 해당하는 인덱스 찾기 return 인덱스 값
    * @param code
    * @return
    */
   public int findLocate(String code) {
	   for (int i = 0; i < count; i++) {
		   if (goodsArr[i].getCode().equals(code))
			   return i;
	   }
	   return -1;
   }
   
   /**
    * 삭제하려는 상품코드를 입력 받아
    * @param code
    * @return
    */
   public int delete(String code) {
	   int locate = findLocate(code);
	   
	   if (locate == -1) return -1;
	   
	   goodsArr[locate] = null;
	   for (int i = locate; i< count -1; i++) {
		   goodsArr[i] = goodsArr[i+1];
	   }
	   goodsArr[--count]= null;
	   return 1;
   }
}