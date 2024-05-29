package com.training.librarymanagement.impl;

import com.training.librarymanagement.entity.Librarian;
import com.training.librarymanagement.entity.Student;
import com.training.librarymanagement.pojo.AssignLibrarian;
import com.training.librarymanagement.repository.LibrarianRepo;
import com.training.librarymanagement.repository.StudentRepo;
import com.training.librarymanagement.services.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Component
@Service
public class LibrarianServiceImpl implements LibrarianService {
    @Autowired
    LibrarianRepo librarianRepo;

    @Autowired
    StudentRepo studentRepo;
    @Override
    public Librarian createLibrarian(Librarian l) {
        UUID uid = UUID.randomUUID();
        l.setUuid(uid);
        return librarianRepo.save(l);
    }

    @Override
    public Librarian getLibrarian(UUID uid) {
        return librarianRepo.findByUuid(uid);
    }

    @Override
    public List<Librarian> allLibrarian() {
        return librarianRepo.findAll();
    }

    @Override
    public Librarian updateLibrarian(Librarian l) {
        Librarian lib = librarianRepo.findByUuid(l.getUuid());
        lib.setName(l.getName());
        return librarianRepo.save(lib);
    }
    public Student giveLibrarian(AssignLibrarian asl){
        Student s1 = studentRepo.findByUuid(asl.getStudent_Uuid());
        s1.setLibrarians(librarianRepo.findByUuidIn(asl.getLibrarian_Uuid()));
        asl.getLibrarian_Uuid().forEach(lib->{Librarian l = librarianRepo.findByUuid(lib);l.setStudent2(s1);});
        return studentRepo.save(s1);
    }

    public Librarian delete(int id){
        return librarianRepo.deleteById(id);
    }
}