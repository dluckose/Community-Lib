package com.library.controller;

public class BookForm {
	
	private long bookid;
	private String bookisbnno;
	private String title;
	private String author;
	private String academicclass;
	private String genre;
	private String publisher;
	private String publish_year;
	private boolean status;
 
	
	
	public BookForm() {
	
	}
	
	
	public BookForm(long bookid, String bookisbnno, String title, String academicclass, String genre, String publisher,
			String publish_year, boolean status) {
		super();
		this.bookid = bookid;
		this.bookisbnno = bookisbnno;
		this.title = title;
		this.academicclass = academicclass;
		this.genre = genre;
		this.publisher = publisher;
		this.publish_year = publish_year;
		this.status = status;
	}


	public long getbookid() {
		return bookid;
	}
	public void setBookid(long book_id) {
		this.bookid = book_id;
	}

	
	public String getBookisbnno() {
		return bookisbnno;
	}
	public void setBookisbnno(String bookisbnno) {
		this.bookisbnno = bookisbnno;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getAcademicclass() {
		return academicclass;
	}
	public void setAcademicclass(String academicclass) {
		this.academicclass = academicclass;
	}
	
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getPublish_year() {
		return publish_year;
	}
	
	public void setPublish_year(String publish_year) {
		this.publish_year = publish_year;
	}

	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean available_status) {
		this.status = available_status;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}

}
