package ex0225.abstractEx;

/**
 * 모든 동물들의 공통의 속성과 메소드를 정의
 */
abstract class Animal {
	int legs;
	
	public abstract void sound();
	public abstract void run();
	public void eat() {
		System.out.println("잘 먹는다!");
	}
}
//////////////////////////////////////////////////

class Dog extends Animal {
	
	public void sound() {
		System.out.println("멍멍");
	}
	public void run() {
		System.out.println("잘 뛴다.");
	}
}

class Pig extends Animal {
	
	public void sound() {
		System.out.println("꿀꿀");
	}
	public void run() {
		System.out.println("잘 못 뛴다.");
	}
}

class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println("야아옹");
		
	}

	@Override
	public void run() {
		System.out.println("잘 뛰고 잘 올라간다.");
		
	}
	
	@Override
	public void eat() {
		System.out.println("쥐를 좋아한다.");
	}
	
}

public class AbstractExam {

	/**
	 * 각 동문들이 가지고 있는 메소드를 모두 호출해보고 싶다.
	 * @param args
	 */
	public static void tests2(Animal animal) {
		animal.eat();
		animal.sound();
		animal.run();
		
		
		System.out.println("=================");
	}
	public static void main(String[] args) {
		
		Animal animal = null; // 필즈를 이용한 다형성
		animal = new Cat();
		tests2(animal);
		
		animal = new Pig();
		tests2(animal);
		
		animal = new Dog();
		tests2(animal);
		}
}
