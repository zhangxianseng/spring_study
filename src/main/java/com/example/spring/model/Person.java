package com.example.spring.model;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2018/12/28 14:59
 */
public class Person {

    private String name;

    public Person(String name){
        this.name=name;
        System.out.println("Spring容器开始通过无参构造器创建Bean实例------------");
    }

    public void say(){
        System.out.println("我的名字是："+name);
    }

}
