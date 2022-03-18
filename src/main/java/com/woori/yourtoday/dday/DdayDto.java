package com.woori.yourtoday.dday;

public class DdayDto {
	private String dday_seq="";
	private String dday_title="";
	private String dday_contents="";
	private String dday_date="";
	private String dday_delyn="";
	
	public String getDday_seq() {
		return dday_seq;
	}
	public void setDday_seq(String dday_seq) {
		this.dday_seq = dday_seq;
	}
	public String getDday_title() {
		return dday_title;
	}
	public void setDday_title(String dday_title) {
		this.dday_title = dday_title;
	}
	public String getDday_contents() {
		return dday_contents;
	}
	public void setDday_contents(String dday_contents) {
		this.dday_contents = dday_contents;
	}
	public String getDday_date() {
		return dday_date;
	}
	public void setDday_date(String dday_regdate) {
		this.dday_date = dday_regdate;
	}
	public String getDday_delyn() {
		return dday_delyn;
	}
	public void setDday_delyn(String dday_delyn) {
		this.dday_delyn = dday_delyn;
	}
	
	@Override
	public String toString() {
		return "DdayDto [dday_seq=" + dday_seq + ", dday_title=" + dday_title + ", dday_contents=" + dday_contents
				+ ", dday_date=" + dday_date + ", dday_delyn=" + dday_delyn + "]";
	}
	
	
	
}
