package ex0226.homework.ex05;

public class Tv implements Remocon{

	@Override
	public void powerOn() {
		System.out.println(this.getClass().getSimpleName()+"를 켰습니다.");
	}
	
	public static void main(String[] args) {
		
		Remocon r = new Tv();
		r.powerOn();
	}
	
}
