package com.galvanize.tmo.paspringstarter;

public class Book {

    private Integer id;
    private String author;
    private String yearPublished;
    private String title;

    public Book() {}

    public Book(Integer id, String author, String year, String title) {
        super();
        this.id = id;
        this.author = author;
        this.yearPublished = year;
        this.title = title;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: " + this.id + ",\n");
        sb.append("author: " + this.author + ",\n");
        sb.append("title: " + this.title + ",\n");
        sb.append("year: " + this.yearPublished);
        return sb.toString();
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

    public String getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
