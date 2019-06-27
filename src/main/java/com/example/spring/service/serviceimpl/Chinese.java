package com.example.spring.service.serviceimpl;

import com.example.spring.service.Country;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2019/6/27 16:53
 */
public class Chinese implements Country {

    private String msg;
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void create() {
        System.out.println(msg);
    }
}
