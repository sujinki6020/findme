package kr.co.findme.repository.domain;

import java.util.Date;

public class Schedule {
	private String userId;
	private int uniqueNo;
	private int recruitNo;
	private String title;
	private String name;
	private Date regDate;
	private Date start;
	private Date end;
	private char apply;
	private String codeNo;
	private String finalRound;
	private char result;
	private String link;
	private int days;

	
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getUniqueNo() {
		return uniqueNo;
	}
	public void setUniqueNo(int uniqueNo) {
		this.uniqueNo = uniqueNo;
	}
	public int getRecruitNo() {
		return recruitNo;
	}
	public void setRecruitNo(int recruitNo) {
		this.recruitNo = recruitNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public char getApply() {
		return apply;
	}
	public void setApply(char apply) {
		this.apply = apply;
	}
	public String getCodeNo() {
		return codeNo;
	}
	public void setCodeNo(String codeNo) {
		this.codeNo = codeNo;
	}
	public String getFinalRound() {
		return finalRound;
	}
	public void setFinalRound(String finalRound) {
		this.finalRound = finalRound;
	}
	public char getResult() {
		return result;
	}
	public void setResult(char result) {
		this.result = result;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	
}
