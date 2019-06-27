package com.example.spring.factory;

import com.example.spring.service.serviceimpl.Chinese;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2019/6/27 16:58
 */
public class CountryStaticFactory {
    public static Chinese getCountry(){
        return new Chinese();
    }
}
