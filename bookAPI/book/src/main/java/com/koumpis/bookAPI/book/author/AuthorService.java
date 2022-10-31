package com.koumpis.bookAPI.book.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;
    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository= authorRepository;
    }
    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

    public void addNewAuthor(Author author) {
        authorRepository.save(author);
    }

    public void deleteAuthor(Long authorId) {
        if(!authorRepository.existsById(authorId)) {
            throw new IllegalStateException("This author can not be found!");
        }
        authorRepository.deleteById(authorId);
    }
}