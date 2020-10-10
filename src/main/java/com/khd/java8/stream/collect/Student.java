package com.khd.java8.stream.collect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private int gradeId; // 年级
    private int classId; // 班级
    private String name; // 名字
    private int score; // 分数
}
