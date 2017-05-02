package com.library.controller;

import com.library.book.domain.Book;
import com.library.book.domain.BookAuthor;

public interface BookService {
	
	public long saveBook(Book book);
	public long saveAuthor(BookAuthor bookAuthor);
	
	
	public Book findByAcademicClass(String academicClass);
	public Book findByAuthor(String authorName);
	public Book findByTitle(String title);
	public Book findByGenre(String genre);
	public Book findByAvailability(boolean status);
 
}
