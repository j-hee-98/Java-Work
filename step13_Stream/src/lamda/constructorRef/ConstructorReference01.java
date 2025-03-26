package lamda.constructorRef;
import java.util.function.Supplier;

class Person {
	 public Person() {
		 
		 System.out.println("새로운 Person 객체 생성!");
	 }
}
	public class ConstructorReference01 {
		
		public static void main(String[] args) {
			
		 //기존방식
		 Supplier<Person> beforePerson = new Supplier<Person>() {
			 
			 public Person get() {
				 return new Person();
			 };
		 };
		 
		 //람다식
		 Supplier<Person> lambdaPerson = () -> new Person();
		 
		 // 생성자 참조
		 Supplier<Person> constructorRefPerson = Person::new;
		 
		 Person p1 = beforePerson.get();
		 Person p2 = lambdaPerson.get();
		 Person p3 = constructorRefPerson.get();
 }
}