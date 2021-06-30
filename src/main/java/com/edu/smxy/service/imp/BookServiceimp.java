package com.edu.smxy.service.imp;

import com.edu.smxy.dao.BookDao;
import com.edu.smxy.entity.Book;
import com.edu.smxy.service.BookService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceimp implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public List<Book> queryList(int pageSize, int pageNumber, Book book) {
        PageHelper.startPage(pageSize,pageNumber);//开启分页
        return bookDao.queryList(book);
    }
}
