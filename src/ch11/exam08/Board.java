package ch11.exam08;

import java.util.Date;

public class Board {
	private int bno;
	private String title;
	private String writer;
	private String getContent;
	private Date writeDate;
	public int getBno() {
		return bno;

	
}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return getContent;
	}
	public void setContent(String getContent) {
		this.getContent = getContent;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
}
