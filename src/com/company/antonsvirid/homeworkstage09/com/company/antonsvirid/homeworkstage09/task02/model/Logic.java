package com.company.antonsvirid.homeworkstage09.com.company.antonsvirid.homeworkstage09.task02.model;

public class Logic {
    public static String msg(double x1, double x2, double x3, double y1, double y2, double y3) {

        String msg = "Sorry, your point not include in given rectangle ";

        if (x3 > x1 && x3 < x2 && y3 < y1 && y3 > y2) {
            msg = "Cool, your point is include in given rectangle!";
        }
        return msg;
    }
}
