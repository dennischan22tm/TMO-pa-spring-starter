package com.galvanize.tmo.paspringstarter;

import org.springframework.stereotype.Repository;

@Repository
public class BookDAO {

    private static Books list = new Books();

    public Books getAllBooks() {
        return list;
    }

    public void addBook(Book book) {
        list.getBooks().add(book);
    }

    public void setBooksEmpty() {
        list.setEmpty();
    }

}
