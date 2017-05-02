package com.library.book.domain;

import java.sql.Date;

public class BookRequest {
	
/*	1.	REQUEST_ID                LONG    // Primary Key
	2.	BOOK_ID                      LONG    // Foreign key
	3.	REQUEST_BY_USER    INTEGER    // Foreign Key
	4.	REQUEST_ON              DATE
	5.	REQUEST_STATUS      1 CHAR (P – PENDING, R- REJECTED, I – ISSUED)*/
	
	private long req_id;
	private long book_id;
	private int req_by_user;
	private Date request_on;
	private Status req_status;
	
	public BookRequest(){
		
	}
	
	public BookRequest(long req_id, long book_id, int req_by_user, Date request_on, Status req_status) {
	this.req_id = req_id;
	this.book_id = book_id;
	this.req_by_user = req_by_user;
	this.request_on = request_on;
	this.req_status = req_status;
}
	
	public long getReq_id() {
		return req_id;
	}

	public void setReq_id(long req_id) {
		this.req_id = req_id;
	}

	public long getBook_id() {
		return book_id;
	}

	public void setBook_id(long book_id) {
		this.book_id = book_id;
	}

	public int getReq_by_user() {
		return req_by_user;
	}

	public void setReq_by_user(int req_by_user) {
		this.req_by_user = req_by_user;
	}

	public Date getRequest_on() {
		return request_on;
	}

	public void setRequest_on(Date request_on) {
		this.request_on = request_on;
	}

	public Status getReq_status() {
		return req_status;
	}

	public void setReq_status(Status req_status) {
		this.req_status = req_status;
	}


}
