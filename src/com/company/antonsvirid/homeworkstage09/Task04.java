package com.company.antonsvirid.homeworkstage09;

import com.company.antonsvirid.homeworkstage09.com.company.antonsvirid.homeworkstage09.task02.view.Printer;

import java.util.Scanner;

public class Task04 {

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
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number A: ");
        double a = scanner.nextDouble();
        System.out.println("Please input number B: ");
        double b = scanner.nextDouble();
        System.out.println("Please input number C: ");
        double c = scanner.nextDouble();

        String msg = msg(a, b, c);
        Printer.print(msg);
    }
}