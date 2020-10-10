package com.khd.java8.stream.collect;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * reduce()只是一种聚合操作，如果我们希望把Stream的元素保存到集合，例如List，
 * 因为List的元素是确定的Java对象，因此，把Stream变为List不是一个转换操作，而是一个聚合操作，它会强制Stream输出每个元素。
 */
public class ExportToList {

    /**
     * 将一组String先过滤掉空字符串，然后把非空字符串保存到List中
     * @param args
     */
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Apple", "", null, "Pear", "  ", "Orange");
        List<String> list = stream.filter(s -> s != null && !s.isBlank()).collect(Collectors.toList());
        System.out.println(list);
    }
}
