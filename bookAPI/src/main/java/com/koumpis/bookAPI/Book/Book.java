package com.koumpis.bookAPI.Book;

import com.koumpis.bookAPI.Author.Author;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="book")
public class Book {
    @Id
    private Long book_id;
    private String name, kind, description, language;
    private int length;
    private double rate;
    private Date dop;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name="book_author",
        joinColumns = {
            @JoinColumn(name = "book_id", referencedColumnName = "book_id",
                nullable = false, updatable = false)},
        inverseJoinColumns= {
            @JoinColumn(name = "author_id", referencedColumnName = "author_id",
                nullable = false, updatable = false)})
    private Set<Author> authors= new HashSet<>();


    public Book() {
    }

    public Book(String name, String kind, String description, String language, int length, double rate, Date dop) {
        this.name = name;
        this.kind = kind;
        this.description = description;
        this.language = language;
        this.length = length;
        this.rate = rate;
        this.dop = dop;
    }

    public Book(Long book_id, String name, String kind, String description, String language, int length, double rate, Date dop) {
        this.book_id = book_id;
        this.name = name;
        this.kind = kind;
        this.description = description;
        this.language = language;
        this.length = length;
        this.rate = rate;
        this.dop = dop;
    }

    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Date getDop() {
        return dop;
    }

    public void setDop(Date dop) {
        this.dop = dop;
    }
}
