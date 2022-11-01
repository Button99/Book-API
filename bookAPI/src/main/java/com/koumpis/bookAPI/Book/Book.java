package com.koumpis.bookAPI.Book;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="book")
public class Book {
    @Id
    private Long id;
    private String name, kind, description, language;
    private int length;
    private double rate;
    private Date dop;

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

    public Book(Long id, String name, String kind, String description, String language, int length, double rate, Date dop) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.description = description;
        this.language = language;
        this.length = length;
        this.rate = rate;
        this.dop = dop;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
