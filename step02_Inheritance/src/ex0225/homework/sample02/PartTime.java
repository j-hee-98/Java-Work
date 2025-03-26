package ex0225.homework.sample02;

public class PartTime extends Employee{

	private int timePay;
	
	public PartTime() {}
	
	public PartTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName,int timePay) {
		super(empNo, eName, job, mgr, hiredate, deptName);
		this.timePay = timePay;
	}

	public int getTimePay() {
		return timePay;
	}

	public void setTimePay(int timePay) {
		this.timePay = timePay;
	};
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" | "+timePay;
	}
	
	@Override
	public void message() {
		System.out.println(geteName() +" 사원은 비정규직입니다.");
	}
}
