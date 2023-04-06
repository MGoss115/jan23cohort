package com.example.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookclub.models.Book;
import com.example.bookclub.repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	// returns all burger
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}

	// creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    
    // update a book
    public Book updateBook(Book b) {
    	return bookRepository.save(b);
    }
    
    //find by id
    public Book findBook(Long id) {
    	Optional<Book>optionalBook = bookRepository.findById(id);
    	if(optionalBook.isPresent()) {
    		return optionalBook.get();
    	}else {
    		return null;
    	}
    }
    
  //delete a book
  	public void deleteBook(Long id) {
  		bookRepository.deleteById(id);
  	}
}
