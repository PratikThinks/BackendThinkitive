package com.training.librarymanagement.pojo;

import com.training.librarymanagement.entity.Student;

import java.util.UUID;

public class Bookpojo {
    private int book_id;
    private String bookName;
    private UUID studentuuid;

    public int getBook_id() {
        return book_id;
    }

    public String getBookName() {
        return bookName;
    }

    public UUID getStudentuuid() {
        return studentuuid;
    }
}
