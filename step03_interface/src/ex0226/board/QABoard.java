package ex0226.board;

public class QABoard extends Board {
	
	private boolean replyState;	// 답변여부
	
	public QABoard() {}

	public QABoard(int bno, String subject, String wirter, String content, boolean replyState) {
		super(bno, subject, wirter, content);
		this.replyState = replyState;
	}

	public boolean isReplyState() {
		return replyState;
	}

	public void setReplyState(boolean replyState) {
		this.replyState = replyState;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("replyState=");
		builder.append(replyState);
		return builder.toString();
	}
	
	
	
	
}
