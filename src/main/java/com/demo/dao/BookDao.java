package com.demo.dao;

import com.demo.entity.Book;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author 亚亚
 * @version 1.0
 * @InterfaceName BookDao
 * @Description TODO
 * @date 2021/6/27 23:55
 **/
@Repository
public interface BookDao {
    @Select("select * from books")
    List<Book> findAll();

    @Select("select * from books")
    Map<String,Book> find();
}
