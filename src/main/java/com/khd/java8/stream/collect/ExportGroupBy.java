package com.khd.java8.stream.collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 分组输出
 * Stream还有一个强大的分组功能，可以按组输出。我们看下面的例子：
 */
public class ExportGroupBy {

    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Blackberry", "Coconut", "Avocado", "Cherry", "Apricots");
        Map<String, List<String>> groups = list.stream()
                .collect(Collectors.groupingBy(s -> s.substring(0, 1), Collectors.toList()));
        System.out.println(groups);
    }
}
