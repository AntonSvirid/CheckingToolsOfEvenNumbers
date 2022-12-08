package com.company.antonsvirid.homeworkstage09.com.company.antonsvirid.homeworkstage09.task02.controller;

import com.company.antonsvirid.homeworkstage09.com.company.antonsvirid.homeworkstage09.task02.model.Logic;
import com.company.antonsvirid.homeworkstage09.com.company.antonsvirid.homeworkstage09.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // a program for determining the exact position of point - whether a point enters a given quadrilateral.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input X-coordinate of upper left rectangle corner: ");
        double x1 = scanner.nextDouble();
        System.out.println("Please input Y-coordinate of upper left rectangle corner: ");
        double y1 = scanner.nextDouble();
        System.out.println("Please input X-coordinate of lower right rectangle corner: ");
        double x2 = scanner.nextDouble();
        System.out.println("Please input Y-coordinate of lower right rectangle corner: ");
        double y2 = scanner.nextDouble();
        System.out.println("Please input X-coordinate of your piont: ");
        double x3 = scanner.nextDouble();
        System.out.println("Please input Y-coordinate of of your point: ");
        double y3 = scanner.nextDouble();

        String msg = Logic.msg(x1, x2, x3, y1, y2, y3);

        Printer.print(msg);
    }
}
