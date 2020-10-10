package com.khd.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 使用方法引用实现忽略大小写排序
 */
public class Practice {
    public static void main(String[] args) {
//        String[] array = new String[]{"Abb", "Daa", "cdd", "Zss"};
//        Arrays.sort(array, Practice::compareTo);
//        System.out.println(Arrays.toString(array));

        String[] array = new String[]{"Abb", "Daa", "cdd", "Zss"};
        List<String> list = Arrays.asList(array);
        Collections.sort(list, Practice::compareTo);
        System.out.println(list);
    }


    /**
     * 忽略大小写排序
     *
     * @param s1
     * @param s2
     * @return
     */
    public static int compareTo(String s1, String s2) {
        return s1.toLowerCase().compareTo(s2.toLowerCase());
    }
}
