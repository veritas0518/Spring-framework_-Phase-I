package com.spring5.autowire;

/**
 * @ClassName: Emp
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/9/19 16:49
 **/

public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test() {
        System.out.println(dept);
    }
}
