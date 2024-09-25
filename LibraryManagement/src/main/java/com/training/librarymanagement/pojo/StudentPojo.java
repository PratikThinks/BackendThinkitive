package com.training.librarymanagement.pojo;

import java.util.List;
import java.util.UUID;

public class StudentPojo {
    private int id;
    private UUID uuid;
    private String name;
    private List<UUID> booksuidlist;
    private UUID buuid;


    public UUID getBuuid() {
        return buuid;
    }

    public int getId() {
        return id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public List<UUID> getBooksuidlist() {
        return booksuidlist;
    }
}
