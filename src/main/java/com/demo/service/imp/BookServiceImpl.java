package com.demo.service.imp;

import com.demo.dao.BookDao;
import com.demo.entity.Book;
import com.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author : zpx
 * @version : 1.0
 * @ClassName : BookServiceImpl
 * @Description : TODO
 * @date : 2021/6/27 23:56
 **/
@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> findAll() {
        System.out.println("输出");
        return bookDao.findAll();
    }

    @Override
    public Map<String, Book> find() {
        return bookDao.find();
    }
}
