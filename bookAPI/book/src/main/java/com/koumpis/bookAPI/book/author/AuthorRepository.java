package com.koumpis.bookAPI.book.author;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    @Override
    Optional<Author> findById(Long aLong);
}
