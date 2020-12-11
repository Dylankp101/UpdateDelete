package com.codingdojo.upd.service;

import com.codingdojo.upd.repository.BookRepository;
import com.sun.xml.bind.v2.model.core.ID;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.upd.models.Book;
@Service
public class BookService {
//	private final BookRepository bookRepository;
//	public BookService(BookRepository bookRepository) {
//		this.bookRepository = bookRepository;
//	}
	@Autowired
	private BookRepository bookRepository;
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // creates a book
    public Book deleteBook(Long id) {
        bookRepository.deleteById(id);
		return null;
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }

    }

