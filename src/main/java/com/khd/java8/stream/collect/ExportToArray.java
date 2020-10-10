package com.khd.java8.stream.collect;

import java.util.List;

/**
 * 输出为Map
 * 如果我们要把Stream的元素收集到Map中，就稍微麻烦一点。因为对于每个元素，添加到Map时需要key和value，因此，我们要指定两个映射函数，分别把元素映射为key和value：
 */
public class ExportToArray {

    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Orange");
        String[] array = list.stream().toArray(String[]::new);
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
