package com.galvanize.tmo.paspringstarter;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<Book> books;

    public List<Book> getBooks() {
        if (books == null)
            books = new ArrayList<>();
        return books;
    }

    public void setEmpty() {
        books = new ArrayList<>();
    }

}
