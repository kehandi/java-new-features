package com.khd.test;

import cn.hutool.core.date.DateUtil;

public class TestDate {

    public static void main(String[] args) {
        String s = DateUtil.secondToTime(3600000);
        System.out.println(s);
    }
}
