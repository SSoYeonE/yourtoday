package com.woori.yourtoday.journal;

public class JournalDto {
	public String note_seq ="";	
	public String note_title ="";		
	public String note_contents	="";	
	public String note_filename1 ="";		
	public String note_filename2 ="";		
	public String note_filename3 ="";		
	public String note_regdate ="";		
	public String note_modedate ="";		
	public String note_view	="";	
	public String note_delyn ="";
	public String getNote_seq() {
		return note_seq;
	}
	public void setNote_seq(String note_seq) {
		this.note_seq = note_seq;
	}
	public String getNote_title() {
		return note_title;
	}
	public void setNote_title(String note_title) {
		this.note_title = note_title;
	}
	public String getNote_contents() {
		return note_contents;
	}
	public void setNote_contents(String note_contents) {
		this.note_contents = note_contents;
	}
	public String getNote_filename1() {
		return note_filename1;
	}
	public void setNote_filename1(String note_filename1) {
		this.note_filename1 = note_filename1;
	}
	public String getNote_filename2() {
		return note_filename2;
	}
	public void setNote_filename2(String note_filename2) {
		this.note_filename2 = note_filename2;
	}
	public String getNote_filename3() {
		return note_filename3;
	}
	public void setNote_filename3(String note_filename3) {
		this.note_filename3 = note_filename3;
	}
	public String getNote_regdate() {
		return note_regdate;
	}
	public void setNote_regdate(String note_regdate) {
		this.note_regdate = note_regdate;
	}
	public String getNote_modedate() {
		return note_modedate;
	}
	public void setNote_modedate(String note_modedate) {
		this.note_modedate = note_modedate;
	}
	public String getNote_view() {
		return note_view;
	}
	public void setNote_view(String note_view) {
		this.note_view = note_view;
	}
	public String getNote_delyn() {
		return note_delyn;
	}
	public void setNote_delyn(String note_delyn) {
		this.note_delyn = note_delyn;
	}
	
	
	@Override
	public String toString() {
		return "JournalDto [note_seq=" + note_seq + ", note_title=" + note_title + ", note_contents=" + note_contents
				+ ", note_filename1=" + note_filename1 + ", note_filename2=" + note_filename2 + ", note_filename3="
				+ note_filename3 + ", note_regdate=" + note_regdate + ", note_modedate=" + note_modedate
				+ ", note_view=" + note_view + ", note_delyn=" + note_delyn + "]";
	}
	

	
	
}
