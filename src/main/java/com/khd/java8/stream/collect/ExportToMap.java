package com.khd.java8.stream.collect;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 输出为Map
 * 如果我们要把Stream的元素收集到Map中，就稍微麻烦一点。因为对于每个元素，添加到Map时需要key和value，因此，我们要指定两个映射函数，分别把元素映射为key和value：
 */
public class ExportToMap {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("APPL:Apple", "MSFT:Microsoft");
        Map<String, String> map = stream
                .collect(Collectors.toMap(
                        // 把元素s映射为key:
                        s -> s.substring(0, s.indexOf(':')),
                        // 把元素s映射为value:
                        s -> s.substring(s.indexOf(':') + 1)));
        System.out.println(map);

        // 可以修改，不是永恒不变量
        map.put("HAHA", "1212");
        System.out.println(map);

        // 尝试用别的方法，失败
        /*stream.map(kv -> {
            String[] ss = kv.split(":", 2);
            return Map.of(ss[0], ss[1]);
        }).forEach(m -> {
            System.out.println(m + "==" + );
        });*/
    }
}
