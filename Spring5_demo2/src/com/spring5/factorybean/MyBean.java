package com.spring5.factorybean;

import com.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName: MyBean
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/9/19 13:17
 **/

public class MyBean implements FactoryBean<Course> {

    //定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCourseName("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
