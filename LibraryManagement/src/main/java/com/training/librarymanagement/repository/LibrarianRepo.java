package com.training.librarymanagement.repository;

import com.training.librarymanagement.entity.Book;
import com.training.librarymanagement.entity.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface LibrarianRepo extends JpaRepository<Librarian,Integer> {
    Librarian findByUuid(UUID uuid);

    Librarian deleteById(int id);

    List<Librarian> findByUuidIn(Iterable<UUID> librarians);

}
