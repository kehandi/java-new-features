package com.khd.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 函数式编程，方法引用
 * https://www.liaoxuefeng.com/wiki/1252599548343744/1305207799545890
 */
public class FunctionInterfaceTest {

    /**
     * 主函数
     * 字符串数组排序
     * @param args
     */
    public static void main(String[] args) {
        String[] array = new String[] { "Apple", "Orange", "Banana", "Lemon" };

        // 使用匿名内部类
//        Arrays.sort(array, new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.compareTo(s2);
//            }
//        });

        // 使用Lambda表达式
//        Arrays.sort(array, (s1, s2) -> {
//            return s1.compareTo(s2);
//        });


        // 传入方法引用：静态方法
        Arrays.sort(array, new FunctionInterfaceTest()::cmp2);

        // String.compareTo()方法作为方法引用传入
//        Arrays.sort(array, String::compareTo);


        System.out.println(String.join(", ", array));
    }

    static int cmp(String s1, String s2) {
        return s1.compareTo(s2);
    }

    int cmp2(String s1, String s2) {
        return s1.compareTo(s2);
    }

}