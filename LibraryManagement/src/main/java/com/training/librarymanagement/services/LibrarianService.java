package com.training.librarymanagement.services;

import com.training.librarymanagement.entity.Librarian;

import java.util.List;
import java.util.UUID;


public interface LibrarianService {
    public Librarian createLibrarian(Librarian l);

    public Librarian getLibrarian(UUID uid);

    public List<Librarian> allLibrarian();

    public Librarian updateLibrarian(Librarian l);

}
