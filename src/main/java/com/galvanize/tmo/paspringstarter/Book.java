package com.galvanize.tmo.paspringstarter;

public class Book implements Comparable<Book>{

    private Integer id;
    private String author;
    private String title;
    private Integer yearPublished;

    public Book() {}

    public Book(Integer id, String author, Integer year, String title) {
        super();
        this.id = id;
        this.author = author;
        this.yearPublished = year;
        this.title = title;
    }

    public int compareTo(Book book2) {
        return this.title.compareTo(book2.title);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Integer yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
