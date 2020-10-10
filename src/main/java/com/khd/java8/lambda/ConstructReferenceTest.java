package com.khd.java8.lambda;

import java.util.*;
import java.util.stream.*;


/**
 * 引用构造方法
 */
public class ConstructReferenceTest {

    public static void main(String[] args) {
//        List<String> names = List.of("Bob", "Alice", "Tim");
//        List<String> names = Arrays.asList("Bob", "Alice", "Tim");
//        List<Person> persons = names.stream().map(Person::new).collect(Collectors.toList());
//        System.out.println(persons);

//        // Stream生成的list，可以添加元素
//        Person person = new Person(4, "King");
//        persons.add(person);
//        System.out.println(persons);

//        List<Integer> ids = Arrays.asList(1, 2, 3);
//        List<Person> persons2 = ids.stream().map(Person::new).collect(Collectors.toList());
//        System.out.println(persons2);

        // 扩展：用Map来实例化对象
        List<Map<String, Object>> list3 = new ArrayList<>();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("id", 1);
        map1.put("name", "Bob");

        Map<String, Object> map2 = new HashMap<>();
        map2.put("id", 2);
        map2.put("name", "Mary");

        list3.add(map1);
        list3.add(map2);
        List<Person> persons3 = list3.stream().map(Person::new).collect(Collectors.toList());
        System.out.println(persons3);
    }
}

class Person {
    Integer id;
    String name;

    public Person() {

    }
    public Person(String name) {
        this.name = name;
    }

    public Person(Integer id) {
        this.id = id;
    }

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(Map<String, Object> map) {
        this.id = (Integer) map.get("id");
        this.name = (String) map.get("name");
    }

    @Override
    public String toString() {
        return "Person:" + this.id + ":" + this.name;
    }
}
