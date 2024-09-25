package com.training.librarymanagement.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.lang.reflect.Type;
import java.util.UUID;

@Entity
public class Book {
    @Id
    private int book_id;
    @Column(name = "book_name")
    private String bookName;
    private UUID bookuid;

    @ManyToOne
    @JoinColumn
    @JsonBackReference
    private Student student1;

    public void setStudent1(Student student1) {
        this.student1 = student1;
    }

    public Student getStudent1() {
        return student1;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }



    public int getBook_id() {
        return book_id;
    }

    public String getBookName() {
        return bookName;
    }



    public UUID getBookuid() {
        return this.bookuid;
    }

    public void setBookuid(UUID bookuid) {
        this.bookuid = bookuid;
    }
}
