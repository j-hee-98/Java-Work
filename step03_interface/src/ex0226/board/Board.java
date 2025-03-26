package ex0226.board;

public class Board {
	
	private int bno;
	private String subject;
	private String wirter;
	private String content;
	
	public Board() {}

	public Board(int bno, String subject, String wirter, String content) {
		super();
		this.bno = bno;
		this.subject = subject;
		this.wirter = wirter;
		this.content = content;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getWirter() {
		return wirter;
	}

	public void setWirter(String wirter) {
		this.wirter = wirter;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("bno=");
		builder.append(bno);
		builder.append(", subject=");
		builder.append(subject);
		builder.append(", wirter=");
		builder.append(wirter);
		builder.append(", content=");
		builder.append(content);
		builder.append(",");
		return builder.toString();
	}
	
	
}
