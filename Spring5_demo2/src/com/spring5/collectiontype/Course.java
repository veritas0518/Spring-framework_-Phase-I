package com.spring5.collectiontype;

/**
 * @ClassName: Course
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/9/19 12:54
 **/

public class Course {
    private String courseName; //课程名称

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                '}';
    }
}
