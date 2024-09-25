package com.training.librarymanagement.pojo;
import java.util.List;
import java.util.UUID;

public class AssignLibrarian {
    List<UUID> librarian_Uuid;
    UUID student_Uuid;

    public List<UUID> getLibrarian_Uuid() {
        return librarian_Uuid;
    }

    public UUID getStudent_Uuid() {
        return student_Uuid;
    }
}
