package com.edu.smxy.entity;

public class Book {
    private int id;
    private String ISBN;
    private String book_name;
    private String writer;
    private String publish;
    private String publish_time;
    private String content;

    public Book(String book_name, String content) {
        this.book_name = book_name;
        this.content = content;
    }

    public Book(String ISBN, String book_name, String writer, String publish, String publish_time, String content) {
        this.ISBN = ISBN;
        this.book_name = book_name;
        this.writer = writer;
        this.publish = publish;
        this.publish_time = publish_time;
        this.content = content;
    }

    public Book() {
    }

    public Book(int id, String ISBN, String book_name, String writer, String publish, String publish_time, String content) {
        this.id = id;
        this.ISBN = ISBN;
        this.book_name = book_name;
        this.writer = writer;
        this.publish = publish;
        this.publish_time = publish_time;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(String publish_time) {
        this.publish_time = publish_time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", ISBN='" + ISBN + '\'' +
                ", book_name='" + book_name + '\'' +
                ", writer='" + writer + '\'' +
                ", publish='" + publish + '\'' +
                ", publish_time='" + publish_time + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
