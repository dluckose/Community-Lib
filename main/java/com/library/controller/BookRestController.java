package com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.library.book.domain.Book;
import com.library.book.domain.BookAuthor;

@Controller
public class BookRestController {
	
	@Autowired
	BookService bookService ;
	
	@RequestMapping(value = "/book/{name}", method = RequestMethod.GET)
	public String getBook(@PathVariable("name")String name, Model model) {

		Book book = bookService.findByTitle(name);
		
		model.addAttribute("bookname", book.getTitle());

		return "book/bookform";
	}
	

	@RequestMapping(value = "/addBook", method = RequestMethod.GET)
	public String addBooks(@ModelAttribute("bookForm") BookForm bookForm) 
	{
	return"book";	
	}
	
	@RequestMapping(value = "/donate", method = RequestMethod.POST)
	public String registration(@ModelAttribute("bookForm") BookForm bookForm, Model model) {
		
		Book book = new Book();
		BookAuthor bookAuthor = new BookAuthor();
		
		book.setAcademicclass(bookForm.getAcademicclass());
		book.setBookisbnno(bookForm.getBookisbnno());
		book.setGenre(bookForm.getGenre());
		book.setPublish_year(bookForm.getPublish_year());
		book.setPublisher(bookForm.getPublisher());
		
		bookAuthor.setAuthorname(bookForm.getAuthor());
		bookAuthor.setIsbnno(bookForm.getBookisbnno());
		

		bookService.saveBook(book);
		bookService.saveAuthor(bookAuthor);
		model.addAttribute("bookForm",bookForm);
		
		return "bookdonationsuccess";
	}

}
