package com.library.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.library.book.domain.BookAuthor;
@Repository
public interface BookAuthorRepository extends CrudRepository<BookAuthor,Integer>{

	public BookAuthor findByAuthorname(String authorName);
	
	


}
