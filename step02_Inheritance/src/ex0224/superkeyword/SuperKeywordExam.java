package ex0224.superkeyword;


class Animal {
	
	int age = 5;
	String bodyColor;
	
	public void sound() {
		System.out.println("super sound call");
	}
	public void eat() {
		System.out.println("super eat all");
	}
}
////////////////////////////////////////////////////

class Cat extends Animal {
	
	int age = 2;
	int weight;
	
	@Override // @는 annotation 재정의 되었다고 표시
	public void sound() {
		System.out.println("야아옹");
	}

	public void run() {
		System.out.println("잘 뛰네~");
	}
	
	public void test() {
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
		System.out.println("=============");
		
		System.out.println(bodyColor);
		System.out.println(this.bodyColor);
		System.out.println(super.bodyColor);
		System.out.println("=============");
		
		System.out.println(weight);
		System.out.println(this.weight);
//		System.out.println(super.weight); // 부모에 없다.
		System.out.println("=============");
		
		System.out.println("====메소드 호출====");
		sound();
		this.sound();
		super.sound();

		System.out.println("=======================");
		eat();
		this.eat();
		super.eat();
		
		System.out.println("=======================");
		run();
		this.run();
//		super.run(); // 부모가 자식 요소에 있는 메서드 사용 X
		
	}
}

/////////////////////////////////////////////////////
public class SuperKeywordExam {
	
	public static void main(String[] args) {
		
//		new Cat().test();
		
		Cat cat = new Cat();
		System.out.println(cat.age);
		System.out.println(cat.bodyColor);
		System.out.println(cat.weight);
		
		cat.sound();
		cat.eat();
		cat.run();
		
		System.out.println("==========================");
		Animal animal = new Cat();	// 다형성 (animal변수로 Animal 영역만 접근가능)
		System.out.println(animal.age);
		System.out.println(animal.bodyColor);
//		System.out.println(animal.weight);
		
		animal.sound();	// 야아옹 (부모 타입 일지라도 재정의된 메소드가 호출된다)
		animal.eat();
//		animal.run();
		
		System.out.println("animal주소 = "+animal);
		
		// animal로 접근이 안되는 ObjectDownCasting을 이용해서 접근가능
		
		if (animal instanceof Cat) {
			
			Cat c = (Cat)animal;
			System.out.println("c주소 = "+c);
			System.out.println(c.weight);
			c.run();			
		}
		
	}
	
}
