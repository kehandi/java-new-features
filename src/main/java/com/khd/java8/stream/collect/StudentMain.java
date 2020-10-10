package com.khd.java8.stream.collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student(1, 1, "小明", 56);
        Student student2 = new Student(1, 1, "小鼎", 85);
        Student student3 = new Student(1, 2, "小花", 94);
        Student student4 = new Student(1, 2, "小龙", 26);

        List<Student> studentList = List.of(student1, student2, student3, student4);

        // 把学生按照年级归类
        //Map<Integer, List<Student>> collect = studentList.stream().collect(Collectors.groupingBy(student -> student.getGradeId(), Collectors.toList()));
//        Map<Integer, List<Student>> collect = studentList.stream().collect(Collectors.groupingBy(Student::getGradeId, Collectors.toList()));

        // 把学生按照年级班级归类
        Map<String, List<Student>> collect = studentList.stream().collect(Collectors.groupingBy(student -> student.getGradeId() + "年级" + student.getClassId() + "班", Collectors.toList()));

        // 回顾Collectors.toMap
//        Map<String, Integer> collect = studentList.stream().collect(Collectors.toMap(Student::getName, Student::getScore));
        System.out.println(collect);
    }
}
