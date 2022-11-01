package com.koumpis.bookAPI.Author;

import javax.persistence.*;

@Entity
@Table(name="author")
public class Author {
    @Id
    private Long author_id;
    private String firstName, lastName;
    private int age;

    public Author() {

    }

    public Author(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Author(Long id, String firstName, String lastName, int age) {
        this.author_id = author_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Long author_id) {
        this.author_id = author_id;
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
}
