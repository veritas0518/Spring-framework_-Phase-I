package com.spring5.collectiontype;

import java.util.*;

/**
 * @ClassName: Stu
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/9/18 20:47
 **/

public class Stu {
    //1.数组类型属性
    private String[] courses;

    //2.list集合类型属性
    private List<String> list;

    //3.map集合类型属性
    private Map<String, String> maps;

    //4.set集合类型属性
    private Set<String> sets;

    //学生所学多门课程
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void test() {
        System.out.println(Arrays.toString(courses)); //作为字符串输出
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(courseList);
    }
}
