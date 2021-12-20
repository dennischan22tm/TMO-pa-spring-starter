package com.galvanize.tmo.paspringstarter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Book addBook(@RequestBody Book book) {
        Integer id = bookDao.getAllBooks().getBooks().size()+1;
        book.setId(id);
        bookDao.addBook(book);
        return book;
    }

    @DeleteMapping(path = "/api/books")
    public String deleteBooks() {
        bookDao.setBooksEmpty();
        return "";
    }

}
