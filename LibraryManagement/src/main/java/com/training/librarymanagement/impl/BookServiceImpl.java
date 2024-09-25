package com.training.librarymanagement.impl;

import com.training.librarymanagement.entity.Book;
import com.training.librarymanagement.entity.Librarian;
import com.training.librarymanagement.entity.Student;
import com.training.librarymanagement.pojo.AssignBook;
import com.training.librarymanagement.repository.BookRepo;
import com.training.librarymanagement.repository.StudentRepo;
import com.training.librarymanagement.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Component
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepo bookRepo;

    @Autowired
    StudentRepo studentRepo;
    @Override
    public Book createBook(Book b) {
        UUID uid = UUID.randomUUID();
        b.setBookuid(uid);
        return bookRepo.save(b);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public Book update(Book b) {
        Book b1 = bookRepo.findByBookuid(b.getBookuid());
        b1.setBookName(b.getBookName());
        return bookRepo.save(b1);
    }

    public void delete(int id){
        bookRepo.deleteById(id);

    }

    public Student assignbook(AssignBook bs){
        Student s1 = studentRepo.findByUuid(bs.getStudent_Uuid());
        List<Book> booklist = bookRepo.findByBookuidIn(bs.getBook_Uuid());
        s1.setBooks(booklist);
        bs.getBook_Uuid().forEach(bok->{Book b = bookRepo.findByBookuid(bok);b.setStudent1(s1);});
        return studentRepo.save(s1);


    }

}
