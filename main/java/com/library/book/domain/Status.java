package com.library.book.domain;

public enum Status {
	PENDING('P'),REJECTED('R'),ISSUED('I');
	
	private char status ;
	
	Status(char status){
		this.status = status;
	}

}
