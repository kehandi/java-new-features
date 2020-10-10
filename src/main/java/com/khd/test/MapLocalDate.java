package com.khd.test;

import java.time.LocalDate;
import java.util.Date;

public class MapLocalDate {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        System.out.println(year);
    }
}
