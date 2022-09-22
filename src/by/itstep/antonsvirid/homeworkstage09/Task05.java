package by.itstep.antonsvirid.homeworkstage09;

import java.util.Scanner;

public class Task05 {
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
    public static void print(String msg) {
        System.out.println(msg);
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
        Task02.print(msg);
    }
}