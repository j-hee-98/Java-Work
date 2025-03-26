package ex0227.ex05;

public class Exam05 {

	public static void main(String[] args) {
		
		Course co = new Course();
		
		co.register1(new Applicant<Person>(new Person()));
		co.register1(new Applicant<Worker>(new Worker()));
		co.register1(new Applicant<Student>(new Student()));
		co.register1(new Applicant<HighStudent>(new HighStudent()));
		co.register1(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		System.out.println("\n---<? super Worer> 인 경우 ---");
		co.register2(new Applicant<Person>(new Person()));
		co.register2(new Applicant<Worker>(new Worker()));
		
//		co.register2(new Applicant<Student>());
//		co.register2(new Applicant<HighStudent>());
//		co.register2(new Applicant<MiddleStudent>());
		
		System.out.println("\n---<? extends Student> 인 경우 ---");
//		co.register3(new Applicant<Person>());
//		co.register3(new Applicant<Worker>());
		
		co.register3(new Applicant<Student>(new Student()));
		co.register3(new Applicant<HighStudent>(new HighStudent()));
		co.register3(new Applicant<MiddleStudent>(new MiddleStudent()));
	}
}

