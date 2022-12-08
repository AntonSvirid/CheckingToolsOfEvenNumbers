package com.company.antonsvirid.homeworkstage09.com.company.antonsvirid.homeworkstage09.task04.model;

public class Logic {
    public static String msg(double a, double b, double c) {
        String msg = "Error, no one even number";

        if (a % 2 == 0) {
            msg = "Number A is even";
        } else if (b % 2 == 0) {
            msg = "Number B is even";
        } else if (c % 2 == 0) {
            msg = "Number C is even";
        }
        return msg;
    }
}
