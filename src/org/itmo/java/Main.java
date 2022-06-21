package org.itmo.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");

        // 2
        double a = (46 + 10) * (10.0 / 3);
        System.out.println(a);

        int a1 = 29 * 4 * (-15);
        System.out.println(a1);
        // 3

        double number = 10500;
        double result = number / 10.0 / 10;
        System.out.println(result);

        // 4
        double result2 = 3.6 * 4.1 * 5.9;
        System.out.println(result2);

        // 5
        Scanner sc = new Scanner(System.in);
        Integer s1 = sc.nextInt();
        Integer s2 = sc.nextInt();
        Integer s3 = sc.nextInt();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //6
        System.out.println("ВВедите число");
        int b3 = sc.nextInt();

        if (b3 % 2 != 0) {
            System.out.println("Nechetnoe");
        } else if (b3 > 100) {
            System.out.println("Выход за пределы");
        } else {
            System.out.println("4etnoe");
        }
        System.out.println("YO");
    }
}