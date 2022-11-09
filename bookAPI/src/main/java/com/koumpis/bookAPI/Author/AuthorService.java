package com.koumpis.bookAPI.Author;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void updateAuthor(Author author) {
        boolean exists= authorRepository.existsById(author.getAuthor_id());
        if(!exists) {
            throw new IllegalStateException("This Author does not exists.");
        }
        authorRepository.save(author);
    }

    public Optional<Author> getAuthor(Long authorId) {
        boolean exists= authorRepository.existsById(authorId);

        if(!exists) {
            throw new IllegalStateException("This Author does not exists");
        }
        return authorRepository.findById(authorId);
    }
}
