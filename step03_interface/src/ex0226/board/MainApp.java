package ex0226.board;

public class MainApp {

	BoardService service;	// FreeXxxImpl or QAXxxImpl or UploadXXXImpl
	Board board; // FreeBoard, QABoard, uploadBoard
	
	public MainApp() {
		//호출
		//1.Free
		service = new FreeBoardServiceImpl();
		board = new FreeBoard(100,"안녕","희정","안녕하세요.");
		
		test(service, board);
		
		//2.QA
		service = new QABoardServiceImpl();
		board = new QABoard(10,"안녕 QA","이미영","복잡하다.", true);
		
		test(service, board);
		//3.Upload
		
		service = new UploadBoardServiceImpl();
		board = new UploadBoard(10,"안녕 upload","삼순이","파일첨부해요.", "a.jpg");
		
		test(service, board);
	}
	
	public void test(BoardService service, Board board) {	// 매개변수를 이용한 다형성
		// 각 게시판의 기능을 호출
		service.insert(board);
		service.update(board);
		
		service.selectByBno(5);
		
		service.delete(5);
		
		BoardService.selectAll();
		
		System.out.println("----------------------");
	}
	
	public static void main(String[] args) {
		
		System.out.println("*****Test 해보자*****");
		new MainApp();
	}
}
