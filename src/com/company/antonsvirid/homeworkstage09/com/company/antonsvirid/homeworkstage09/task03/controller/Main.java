package com.company.antonsvirid.homeworkstage09.com.company.antonsvirid.homeworkstage09.task03.controller;

import com.company.antonsvirid.homeworkstage09.com.company.antonsvirid.homeworkstage09.view.Printer;
import com.company.antonsvirid.homeworkstage09.com.company.antonsvirid.homeworkstage09.task03.model.Logic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number A: ");
        double a = scanner.nextDouble();
        System.out.println("Please input number B: ");
        double b = scanner.nextDouble();
        System.out.println("Please input number C: ");
        double c = scanner.nextDouble();

        String msg = Logic.msg(a, b, c);

        Printer.print(msg);
    }
}
