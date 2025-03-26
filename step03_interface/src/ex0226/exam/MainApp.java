package ex0226.exam;

/**
 * 상속 - 같은 속성을 가진 경우 중복을 줄이기 위해 상속
 * 인터페이스 - 같은 메서드를 가진 경우
 * - 규격을 정해줄 수 있다
 */

public class MainApp {

	public static void main(String[] args) {
		// Tv 2대 , Audio 2대 저장하고 그 정보를 출력한다.
		ElecFunction elec[] = new ElecFunction[5];

		elec[0] = new Tv("A01", 500000, 12);
		elec[1] = new Tv("A02", 2500, 20);
		elec[2] = new Tv("A03", 3000, 30);

		elec[3] = new Audio("A04", 8500, 200);
		elec[4] = new Audio("A05", 700, 100);

		for (ElecFunction e : elec) {
			 e.start();
			//System.out.println(e);
		}

	}
}
