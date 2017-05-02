package com.library.book.domain;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "book_author")
public class BookAuthor {
	
/*	1.	BOOK_ISBN_NO            12 CHARS    // PRIMARY KEY
	2.	BOOK_AUTHOR_SL       SMALLINT  // PRIMARY KEY
	3.	AUTHOR_NAME             40 CHAR*/
	
	private String isbnno;
	private int authorId;
	private String authorname;
	
	
	public BookAuthor() {
	}


	public BookAuthor(String isbn_no, int author_sno, String author_name) {
		super();
		this.isbnno = isbn_no;
		this.authorId = author_sno;
		this.authorname = author_name;
	}

	@Column(name = "book_isbn_no", unique = true, nullable = false)
	public String getIsbnno() {
		return isbnno;
	}


	public void setIsbnno(String isbnno) {
		this.isbnno = isbnno;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "book_author_sl", unique = true, nullable = false)
	public int getAuthorId() {
		return authorId;
	}


	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	@Column(name = "author_name")
	public String getAuthorname() {
		return authorname;
	}


	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}



	
	
	
	

}
