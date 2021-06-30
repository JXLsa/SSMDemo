package com.edu.smxy.service;

import com.edu.smxy.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {
    public List<Book> queryList(int pageSize, int pageNumber, Book book);
}
