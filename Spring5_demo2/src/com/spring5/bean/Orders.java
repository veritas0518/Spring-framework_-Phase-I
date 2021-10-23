package com.spring5.bean;

/**
 * @ClassName: Orders
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/9/19 14:31
 **/

public class Orders {
    private String orderName;

    //创建无参数构造
    public Orders() {
        System.out.println("第一步 执行无参数构造创建bean实例");
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
        System.out.println("第二步 调用set方法设置属性值");
    }

    //创建执行的初始化的方法
    public void initMethod() {
        System.out.println("第三步 执行初始化方法");
    }

    //创建执行的销毁的方法
    public void destroyMethod() {
        System.out.println("第五步 执行销毁的方法");
    }
}
