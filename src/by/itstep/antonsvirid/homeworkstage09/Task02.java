package by.itstep.antonsvirid.homeworkstage09;

import java.util.Scanner;

public class Task02 {

    public static String msg(double x1, double x2, double x3, double y1, double y2, double y3) {

        String msg = "Sorry, your point not include in given rectangle ";

        if (x3 > x1 && x3 < x2 && y3 < y1 && y3 > y2) {
            msg = "Cool, your point is include in given rectangle!";
        }
        return msg;
    }

    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {

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

        String msg = msg(x1, x2, x3, y1, y2, y3);
        print(msg);
    }
}