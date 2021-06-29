package com.demo.controller;

import com.demo.entity.Book;
import com.demo.service.BookService;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * @author : zpx
 * @version : 1.0
 * @ClassName : BookController
 * @Description : TODO
 * @date : 2021/6/28 0:08
 **/
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/findAll")
    @ResponseBody
    public String findAll(){
//        Map<String,Book> map = bookService.find();
        List<Book> list = bookService.findAll();
        JSONArray result = new JSONArray(list);
        System.out.println(result);
        System.out.println("Controller表现层：查询所有账户...");
//        model.addAttribute("list",result);

        return result.toString();
    }
}
