package com.demo.service;

import com.demo.dao.BookDao;
import com.demo.entity.Book;

import java.util.List;
import java.util.Map;

/**
 * @author 亚亚
 * @version 1.0
 * @InterfaceName BookService
 * @Description TODO
 * @date 2021/6/27 23:55
 **/
public interface BookService {
    List<Book> findAll();

    Map<String,Book> find();
}
