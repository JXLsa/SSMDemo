package com.edu.smxy.controller;

import com.edu.smxy.entity.Book;
import com.edu.smxy.service.imp.BookServiceimp;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookServiceimp bookServiceimp;
    @RequestMapping("/show")
    public String showBooks(Book book, Model model, @RequestParam(defaultValue = "1") int pageSize, @RequestParam(defaultValue = "3") int pageNumber){
        List<Book> books=bookServiceimp.queryList(pageSize,pageNumber,book);
        PageInfo<Book> pageInfo=new PageInfo<Book>(books);
        model.addAttribute("book",book);
        model.addAttribute("pageInfo",pageInfo);
        return "showBook";

    }


}
