package com.library.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.library.book.domain.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
	
	public Book findByTitle(String title);
	
	public Book findByAcademicclass(String academicclass);
	
	public Book findByStatus(boolean status);
	
	public Book findByGenre(String genre);
	
	public Book findByBookisbnno(String isbnno);

}
