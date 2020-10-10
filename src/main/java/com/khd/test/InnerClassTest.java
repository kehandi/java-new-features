package com.khd.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InnerClassTest {
    public static void main(String[] args) {
        List<String> demoList = new ArrayList<>();
        demoList.add("12343");
        demoList.add("bbb");
        demoList.add("aaa");
        demoList.add("ccc");
        demoList.add("cab");
        Collections.sort(demoList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println(demoList);
        System.out.println(Integer.compare(1, 0));

    }
}
