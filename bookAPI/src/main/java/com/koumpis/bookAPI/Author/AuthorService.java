package com.koumpis.bookAPI.Author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository= authorRepository;
    }

    public void addAuthor(Author author) {
        authorRepository.save(author);
    }

    public void deleteAuthor(Long authorId) {
        if(!authorRepository.existsById(authorId)) {
            throw new IllegalStateException("This user doesn't exists!");
        }
        authorRepository.deleteById(authorId);
    }

    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

}
