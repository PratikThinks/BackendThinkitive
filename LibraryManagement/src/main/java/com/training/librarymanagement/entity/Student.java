package com.training.librarymanagement.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity(name = "student")
public class Student {
    @Id

    private int id;
    private UUID uuid;

    @Column(name = "student_name")
    private String name;

    @OneToMany(mappedBy = "student1")
    @JsonManagedReference
    private List<Book> books;

    @OneToMany(mappedBy = "student2")
    private List<Librarian> librarians;

    public void setId(int id) {
        this.id = id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Librarian> getLibrarians() {
        return librarians;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setLibrarians(List<Librarian> librarians) {
        this.librarians = librarians;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getId() {
        return id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", student_uid=" + uuid +
                ", name='" + name + '\'' +
                ", books=" + books +
                ", librarians=" + librarians +
                '}';
    }
}
