package com.training.librarymanagement.repository;

import com.training.librarymanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    Student findByUuid(UUID uuid);
    Student deleteById(int id);
}
