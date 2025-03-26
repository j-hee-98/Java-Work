package ex0225.homework.sample02;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee [] ep = new Employee [5];
		
		ep[0] = new FullTime(10, "유재석", "개그우먼", 0 , "2013-05-01", "무한도전",8500,200);
		ep[1] = new FullTime(20, "박명수", "가수",10, "2013-06-20", "무한도전",7500,100);
		ep[2] = new FullTime(30, "정준하", "예능인",10 , "2013-06-22", "무한도전",6000,0);
		
		ep[3] = new PartTime(40, "노홍철", "예능인",20 , "2014-05-01", "무한도전",20000);
		ep[4] = new PartTime(50, "하하", "가수",30 , "2014-05-02", "무한도전",25000);
		
		System.out.println("***************** Emp 정보 *****************");
		for (int i = 0; i < ep.length; i++) {
			System.out.println(ep[i].toString());
		}
			
		
		
		System.out.println("\n************* Emp Message ***********");		
		for (Employee employee: ep) {
			employee.message();
		}
		
	}

}






