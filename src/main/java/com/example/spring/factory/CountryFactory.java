package com.example.spring.factory;

import com.example.spring.service.serviceimpl.Chinese;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2019/6/27 17:37
 */
public class CountryFactory {
    public Chinese newInstance(){
        return new Chinese();
    }
}
