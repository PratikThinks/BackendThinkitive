package com.training.librarymanagement.services;

import com.training.librarymanagement.entity.Book;
import com.training.librarymanagement.repository.BookRepo;
import java.util.List;
public interface BookService {

    public Book createBook(Book b);
    public List<Book> getAllBooks();
    public Book update(Book b);

    }
