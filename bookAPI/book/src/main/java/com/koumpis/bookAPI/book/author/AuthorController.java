package com.koumpis.bookAPI.book.author;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="api/v1/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService= authorService;
    }

    @GetMapping
    public List<Author> getAuthors() {
        return authorService.getAuthors();
    }

    @PostMapping(value="/author/add")
    public void newAuthor(@RequestBody Author author) {
        authorService.addNewAuthor(author);
    }

    @DeleteMapping(value="author/{id}/delete")
    public void deleteAuthor(Long authorId) {
        authorService.deleteAuthor(authorId);
    }
    // Same for delete/update
}
