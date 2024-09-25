package com.training.librarymanagement.controller;

import com.training.librarymanagement.entity.Book;
import com.training.librarymanagement.entity.Student;
import com.training.librarymanagement.impl.BookServiceImpl;
import com.training.librarymanagement.pojo.AssignBook;
import com.training.librarymanagement.pojo.Bookpojo;
import com.training.librarymanagement.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookServiceImpl bookServiceImpl;
    @Autowired
    StudentRepo studentRepo;

    @PostMapping
    public Book create(@RequestBody Bookpojo bpj){
        Book b = new Book();
        b.setBookName(bpj.getBookName());
        b.setBook_id(bpj.getBook_id());
//        b.setStudent1(studentRepo.findByUuid(bpj.getStudentuuid()));
        return bookServiceImpl.createBook(b);
//        return b;
    }

    @GetMapping
    public List<Book> getAll(){
        return bookServiceImpl.getAllBooks();
    }

    @PostMapping("/update")
    public Book update(@RequestBody Book b){
        return bookServiceImpl.update(b);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        bookServiceImpl.delete(id);
        return "Successfully Deleted the record";
    }
    @PostMapping("/assignBook")
    public Student assignBook(@RequestBody AssignBook as){
        return bookServiceImpl.assignbook(as);
    }
}
