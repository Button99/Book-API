package com.koumpis.bookAPI.Author;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="api/v1/authors")
public class AuthorController {
    public final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService= authorService;
    }

    @GetMapping
    public List<Author> getAuthors() {
        return authorService.getAuthors();
    }

    @PostMapping(value="add")
    public void addAuthor(@RequestBody Author author) {
        authorService.addAuthor(author);
    }

    @DeleteMapping(value = "/{authorId}/delete")
    public void deleteAuthor(@PathVariable Long authorId) {
        authorService.deleteAuthor(authorId);
    }

    @PutMapping(value = "/update")
    public void updateAuthor(@RequestBody Author author) {
        authorService.updateAuthor(author);
    }

    @GetMapping(value = "/{authorId}")
    public Optional<Author> getAuthor(@PathVariable Long authorId) {
        return authorService.getAuthor(authorId);
    }
}
