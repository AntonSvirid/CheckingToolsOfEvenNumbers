package com.company.antonsvirid.homeworkstage09.com.company.antonsvirid.homeworkstage09.task03.model;

public class Logic {
    public static String msg(double a, double b, double c) {
        String msg = "Numbers are not even";

        if (a % 2 == 0 & b % 2 == 0 & c % 2 == 0) {
            msg = "All numbers are even";
        }
        return msg;
    }
}
