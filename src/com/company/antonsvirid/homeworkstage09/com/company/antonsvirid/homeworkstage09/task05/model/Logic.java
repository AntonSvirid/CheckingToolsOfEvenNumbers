package com.company.antonsvirid.homeworkstage09.com.company.antonsvirid.homeworkstage09.task05.model;

public class Logic {
    public static String msg(double a, double b, double c) {
        String msg = "Error, no one even number or more then one even number in input";

        if (a % 2 == 0 && b % 2 != 0 && c % 2 != 0) {
            msg = "Only number A is even";
        } else if (a % 2 != 0 && b % 2 == 0 && c % 2 != 0) {
            msg = "Only number B is even";
        } else if (a % 2 != 0 && b % 2 != 0 && c % 2 == 0) {
            msg = "Only number C is even";
        }
        return msg;
    }
}
