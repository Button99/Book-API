package com.koumpis.bookAPI.book.author;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author {
    @Id
    private Long id;
    private String firstName, lastName;
    private int age;

    public Author() {

    }

    @javax.persistence.Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Author(Long id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}