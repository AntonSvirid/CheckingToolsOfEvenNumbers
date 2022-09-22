package by.itstep.antonsvirid.homeworkstage09;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number A: ");
        double a = scanner.nextDouble();
        System.out.println("Please input number B: ");
        double b = scanner.nextDouble();
        System.out.println("Please input number C: ");
        double c = scanner.nextDouble();

        String msg = "Numbers are not even";

        if (a % 2 == 0 & b % 2 == 0 & c % 2 == 0) {
            msg = "All numbers are even";
        }

        System.out.println(msg);
    }
}
