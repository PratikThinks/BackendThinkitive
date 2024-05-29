package com.training.librarymanagement.pojo;

import java.util.List;
import java.util.UUID;

public class AssignBook {
    List<UUID> book_Uuid;
    UUID student_Uuid;

    public List<UUID> getBook_Uuid() {
        return book_Uuid;
    }

    public UUID getStudent_Uuid() {
        return student_Uuid;
    }
}
