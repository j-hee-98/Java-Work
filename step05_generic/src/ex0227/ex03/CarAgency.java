package ex0227.ex03;

public class CarAgency implements Rentable<Car> {

	@Override
	public Car rent() {
		
		return new Car();
	}

}
