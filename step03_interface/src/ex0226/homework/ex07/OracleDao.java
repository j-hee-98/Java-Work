package ex0226.homework.ex07;

public class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println(this.getClass().getSimpleName()+"에서 검색");	
	}
	
	@Override
	public void insert() {
		System.out.println(this.getClass().getSimpleName()+"에서 삽입");
	}
	
	@Override
	public void update() {
		System.out.println(this.getClass().getSimpleName()+"에서 수정");	
	}
	
	@Override
	public void delete() {
		System.out.println(this.getClass().getSimpleName()+"에서 삭제");	
	}
}
