package ex0226.exam;

public class Tv extends Elec implements ElecFunction {
	
	private int chnnel;
	
	public Tv() {}
	
	public Tv(int chnnel) {
		this.chnnel = chnnel;
	}
	
	public Tv(String code, int cost, int chnnel) {
		super(code, cost);
		this.chnnel = chnnel;
	}
	
	@Override
	public void start() {
		
		System.out.println(getCode()+"제품 "+super.getClass().getSimpleName()+"를 "+chnnel+"을 본다.");
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
