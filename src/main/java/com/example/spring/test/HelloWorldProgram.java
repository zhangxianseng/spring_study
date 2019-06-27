package com.example.spring.test;

import com.example.spring.model.Person;
import com.example.spring.service.serviceimpl.Chinese;
import com.example.spring.service.serviceimpl.HelloWorldImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2018/12/28 14:54
 */
public class HelloWorldProgram {

    public static void main(String[] args){
        //创建spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //通过getBen()方法获取bean对象
        HelloWorldImpl helloWorld = context.getBean("springHelloWorld",HelloWorldImpl.class);
        //通过获取到的bean对象调用方法
        helloWorld.sayHello();

        /*
        通过构造方法创建bean
         */
        Person person =  context.getBean("person",Person.class);
        person.say();

        /*
        通过静态工厂创建bean
         */
        Chinese chinese = context.getBean("chinese",Chinese.class);
        chinese.create();

        /*
        通过实例化工厂创建bean
         */
        Chinese ch = context.getBean("ch",Chinese.class);
        ch.create();

    }
}
