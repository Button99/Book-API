package com.koumpis.bookAPI.Book;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository= bookRepository;
    }

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        boolean exists= bookRepository.existsById(id);
        if(!exists) {
            throw new IllegalStateException("Error this book does not exists!");
        }
        bookRepository.deleteById(id);
    }

    public Optional<Book> getBook(Long id) {
        return bookRepository.findById(id);
    }

    public void updateBook(Book book) {
        boolean exists= bookRepository.existsById(book.getBook_id());
        if(!exists) {
            throw new IllegalStateException("This book does not exists!");
        }
        bookRepository.save(book);
    }

    //U
}
