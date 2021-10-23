package com.spring5.collectiontype;

import java.util.List;

/**
 * @ClassName: Book
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/9/19 13:02
 **/

public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test() {
        System.out.println(list);
    }
}
