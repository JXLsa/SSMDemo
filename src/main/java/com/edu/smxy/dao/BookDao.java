package com.edu.smxy.dao;

import com.edu.smxy.entity.Book;

import java.util.List;

public interface BookDao {
    List<Book> queryList(Book book);
}
