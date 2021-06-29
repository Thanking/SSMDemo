package com.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author : zpx
 * @version : 1.0
 * @ClassName : Book
 * @Description : TODO
 * @date : 2021/6/27 23:46
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book implements Serializable {
    private int bookId;
    private String bookName;
    private int bookCounts;
    private String detail;
}
