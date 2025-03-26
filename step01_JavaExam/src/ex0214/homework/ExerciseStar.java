package ex0214.homework;

public class ExerciseStar {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("****************************");
		
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("****************************");
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("****************************");
		
		for (int i = 5; i >= 1; i--) {
			
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		String grade = "B";
//		
//		int score1 = switch (grade) {
//		case "A" -> 100;
//		case "B" -> 100 - 20;
//		default -> 60;
//		};
	}
}
