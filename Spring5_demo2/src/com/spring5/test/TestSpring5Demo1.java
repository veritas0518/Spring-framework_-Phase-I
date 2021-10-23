package com.spring5.test;

import com.spring5.autowire.Emp;
import com.spring5.bean.Orders;
import com.spring5.collectiontype.Book;
import com.spring5.collectiontype.Course;
import com.spring5.collectiontype.Stu;
import com.spring5.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: TestSpring5Demo1
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/9/18 21:01
 **/

public class TestSpring5Demo1 {

    @Test
    public void testCollection1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Stu stu = context.getBean("stu", Stu.class); //这里的stu和bean1.xml中的id相对应
        stu.test();
    }

    @Test
    public void testCollection2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        Book book = context.getBean("book", Book.class);
        book.test();
    }

    @Test
    public void testCollection3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }

    @Test
    public void testBean3() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders);

        //手动让bean实例销毁
        context.close();
    }

    @Test
    public void testCollection4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");

        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
