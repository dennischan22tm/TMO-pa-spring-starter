package com.galvanize.tmo.paspringstarter;

import org.springframework.stereotype.Repository;

@Repository
public class BookDAO {

    private static Books list = new Books();

    static {
        list.getBooks().add(new Book(
                1, "hung le", "2021", "cisco sucks"
        ));
    }

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
