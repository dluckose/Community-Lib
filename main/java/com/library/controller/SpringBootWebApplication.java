package com.library.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.library.book.domain.Book;
import com.library.book.domain.BookAuthor;
import com.library.book.domain.BookRequest;
import com.library.user.domain.User;


@SpringBootApplication(scanBasePackages={"com.library.*"})

@EntityScan(basePackageClasses={User.class,Book.class,BookAuthor.class,BookRequest.class})

public class SpringBootWebApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootWebApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

}