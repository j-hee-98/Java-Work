package ex0224.inheritance;

/**
 * 제약사항
 * - 
 */

class CarCenter{
	
	public void engineer(Car cd){
		System.out.println("cd = "+cd);
		
		// 부모타입 변수로는 자식부분 접근 불가
		
		// 전달된 참조변수에 자식부분이 있기 때문에 접근이 가능하도록
		// ObjectDownCasting이 필요하다
//		System.out.println("cd.a = "+cd.a);
		
		// 상속 관계라서 다운캐스팅이 됨
		if (cd instanceof EfSonata) {
			EfSonata ef2 = (EfSonata)cd;
			System.out.println("ef2 = "+ef2);
			System.out.println("ef2.a = "+ ef2.a);
		}
		
	
		System.out.print(cd.carname+" 수리완료!\t");
		System.out.println("청구비용 "+cd.cost+" 원");
		
	}
}

public class PolymorphismExam{
	public static void main(String[] args) {
		
		CarCenter cc=new CarCenter();
		EfSonata ef=new EfSonata(); // EfSonta는 Car
		Carnival ca=new Carnival(); // Carnival는 Car
		Excel ex=new Excel();  // Excel은 Car
		
		Car c= new Car();
		
		System.out.println("ef = "+ef);
		System.out.println("ef.a = "+ef.a);
		System.out.println("-----------------------------");
		System.out.println("s = ");
		
		cc.engineer(c);//
		cc.engineer(ef);//
		cc.engineer(ca);//
		cc.engineer(ex);//
		
		
	
	}
}
