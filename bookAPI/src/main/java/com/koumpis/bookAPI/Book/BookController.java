package com.koumpis.bookAPI.Book;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/book")
public class BookController {
    // CRUD
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService=bookService;
    }

    @GetMapping
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping(value = "add")
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @DeleteMapping(value = "/{id}/delete")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }

    @GetMapping(value = "/{id}")
    public void getBook(@PathVariable Long id) {
        bookService.getBook(id);
    }

    @PutMapping(value = "/update")
    public void updateBook(@RequestBody Book book) {
        bookService.updateBook(book);
    }
}
