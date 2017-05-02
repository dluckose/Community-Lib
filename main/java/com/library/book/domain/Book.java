package com.library.book.domain;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.library.user.domain.User;
@Entity
@Component
@Table(name = "book")
public class Book {

	
	private long bookid;
	private String bookisbnno;
	private String title;
	private String academicclass;
	private String genre;
	private String publisher;
	private String publish_year;
/*	private int donated_by_user;
	private Date donated_on;*/
	private boolean status;
	/*private long issued_request_id;*/
/*	private long receiving_user;
	private Date received_by_user_on;*/
	
	private User user;
	
	public Book() {
		
	}
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "book_id", unique = true, nullable = false)
	public long getbookid() {
		return bookid;
	}
	public void setBookid(long book_id) {
		this.bookid = book_id;
	}

	@Column(name = "book_isbn_no", unique = true, nullable = false)
	public String getBookisbnno() {
		return bookisbnno;
	}
	public void setBookisbnno(String bookisbnno) {
		this.bookisbnno = bookisbnno;
	}
	@Column(name = "book_title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Column(name = "academic_class")
	public String getAcademicclass() {
		return academicclass;
	}
	public void setAcademicclass(String academicclass) {
		this.academicclass = academicclass;
	}
	@Column(name = "genre")
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Column(name = "publisher")
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Column(name = "publish_year")
	public String getPublish_year() {
		return publish_year;
	}
	public void setPublish_year(String publish_year) {
		this.publish_year = publish_year;
	}

	@Column(name = "available_status")
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean available_status) {
		this.status = available_status;
	}
/*	@Column(name = "issued_request_id")
	public long getIssued_request_id() {
		return issued_request_id;
	}
	public void setIssued_request_id(long issued_request_id) {
		this.issued_request_id = issued_request_id;
	}*/
	
	@OneToOne
	@JoinColumn(name="userid")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "";
	}
	

}
