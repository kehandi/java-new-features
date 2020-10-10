package com.khd.test;

import java.util.Map;

public class OfTest {

    public static void main(String[] args) {
        Map<String, String> a = new java.util.HashMap<>(Map.of("a", "123"));
        System.out.println(a);
        a.put("b", "456");
        System.out.println(a);
    }
}
