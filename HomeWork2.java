package HomeWorkApp;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число a:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число b:");
        int b = scanner.nextInt();
        System.out.println("Введите любой текст");
        String c = scanner.next();
        zadanie1(a, b);
        zadanie2(a);
        zadanie3(b);
        zadanie4(a, c);
        zadanie5(1900);
        zadanie5(1904);
        zadanie5(1912);
        zadanie5(1988);
    }

    static void zadanie1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static void zadanie2(int a) {
        if (a >= 0) {
            System.out.println("Введенное число a: Положительное");
        } else {
            System.out.println("Введенное число a: Отрицательное");
        }
    }

    static boolean zadanie3(int b) {
       boolean isTrue = (b<0);
        System.out.println(isTrue);
        return isTrue;
//        if (b < 0) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
    }

    static void zadanie4(int a, String c) {
        int i = 0;
        while (i != a) {
            System.out.println(c);
            i++;
        }
    }

    static boolean zadanie5(int a) {
       boolean isLeap = ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0));
       System.out.println(isLeap);
         return isLeap;
    }
}