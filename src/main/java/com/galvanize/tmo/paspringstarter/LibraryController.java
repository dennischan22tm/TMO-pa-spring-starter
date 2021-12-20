package com.galvanize.tmo.paspringstarter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * references:
 *  https://www.geeksforgeeks.org/how-to-create-a-rest-api-using-java-spring-boot/
 *  https://stackoverflow.com/questions/24292373/spring-boot-rest-controller-how-to-return-different-http-status-codes
 */

@RestController
public class LibraryController {

    @GetMapping("/health")
    public void health() {

    }

    @Autowired
    private BookDAO bookDao;

    @GetMapping(path = "/api/books", produces = "application/json")
    public Books getBooks() {
        return bookDao.getAllBooks();
    }

    @PostMapping(path = "/api/books",
            consumes = "application/json",
            produces = "application/json")
    public Book addBook(@RequestBody Book book, HttpServletResponse response) {
        Integer id = bookDao.getAllBooks().getBooks().size()+1;
        book.setId(id);
        bookDao.addBook(book);
        response.setStatus(HttpServletResponse.SC_CREATED);
        return book;
    }

    @DeleteMapping(path = "/api/books")
    public String deleteBooks(HttpServletResponse response) {
        bookDao.setBooksEmpty();
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
        return "";
    }

}
