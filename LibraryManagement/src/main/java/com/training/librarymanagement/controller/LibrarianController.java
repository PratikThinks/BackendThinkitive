package com.training.librarymanagement.controller;

import com.training.librarymanagement.entity.Librarian;
import com.training.librarymanagement.entity.Student;
import com.training.librarymanagement.impl.LibrarianServiceImpl;
import com.training.librarymanagement.pojo.AssignLibrarian;
import com.training.librarymanagement.pojo.LibrarianPojo;
import com.training.librarymanagement.services.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/librarian")
public class LibrarianController {

    private final LibrarianServiceImpl librarianServiceimpl;

    @Autowired
    public LibrarianController(LibrarianServiceImpl librarianServiceimpl) {
        this.librarianServiceimpl = librarianServiceimpl;
    }

    @PostMapping
    public Librarian create(@RequestBody LibrarianPojo lpjo){
        Librarian librarian = new Librarian();
        librarian.setName(lpjo.getName());
        librarian.setEmpId(lpjo.getEmpId());
        return librarianServiceimpl.createLibrarian(librarian);
    }
    @PostMapping("/assignLibrarian")
    public Student assign(@RequestBody AssignLibrarian asl){
        return librarianServiceimpl.giveLibrarian(asl);
//        return "Hey buddy i am running don't worry";
    }

    @GetMapping("/{uuid}")
    Librarian getLibrarian(@PathVariable UUID uuid){
        return librarianServiceimpl.getLibrarian(uuid);
    }

    @GetMapping
    List<Librarian> getAll(){
        return librarianServiceimpl.allLibrarian();
    }

    @PutMapping
    Librarian update(@RequestBody Librarian lib){
        return librarianServiceimpl.updateLibrarian(lib);
    }

    @DeleteMapping("/{id}")
    Librarian delete(@PathVariable int id){
        return librarianServiceimpl.delete(id);
    }
}
