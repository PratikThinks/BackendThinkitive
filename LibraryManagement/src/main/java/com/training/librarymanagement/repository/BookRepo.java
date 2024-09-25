package com.training.librarymanagement.repository;

import com.training.librarymanagement.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Component
@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {
    Book findByBookuid(UUID bookuid);

    Book deleteById(int id);


    List<Book> findByBookuidIn(Iterable<UUID> book_Uuid);

}
