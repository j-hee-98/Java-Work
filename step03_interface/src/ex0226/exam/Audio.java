package ex0226.exam;

public class Audio extends Elec implements ElecFunction {
	
	private int volumn;
	
	public Audio() {}
	
	public Audio(int volumn) {
		this.volumn = volumn;
	}
	
	public Audio(String code, int cost, int volumn) {
		super(code, cost);
		this.volumn = volumn;
	}
	
	@Override
	public void start() {
		
		System.out.println(getCode()+"의 "+super.getClass().getSimpleName()+"를 "+volumn+"을 듣는다.");
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
		
		return super.toString();
	}
	
}
