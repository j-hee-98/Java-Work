package ex0227.ex03;

public class Exam03 {

	public static void main(String[] args) {
		
		CarAgency caragency = new CarAgency();
		Car car = caragency.rent();
		car.run();
		
		System.out.println("---------------");
		HomeAgency homeagency = new HomeAgency();
		Home home = homeagency.rent();
		home.enter();
		
	}
}
