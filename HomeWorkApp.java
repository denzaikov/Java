package HomeWorkApp;

import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords();     //задание 2
        checkSumSign();       //задание 3
        printColor();         //задание 4
        compareNumbers();    //задание 5
    }

    static void printThreeWords() {
        System.out.println("Задание №2");
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    private static void checkSumSign() {
        System.out.println("Задание №3");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое число:");
//        int a = scanner.nextInt();
//        System.out.println("Введите второе число:");
//        int b = scanner.nextInt();
        int a = -5;
        int b = 3;
        int Sum = a + b;
        if (Sum >= 0) {
            System.out.println("Сумма введенных чисел положительная");
        } else {
            System.out.println("Сумма введенных чисел отрицательная");
        }
    }

    private static void printColor() {
        System.out.println("Задание №4");
        int Value = 102;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число:");
//        int Value = scanner.nextInt();
        if (Value <= 0) {
            System.out.println("Красный");
        } else if ((Value > 0) && (Value <= 100)) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    private static void compareNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание №5");
        int a = 2;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
//        } else { System.out.println("Первое введенное число " +(a)+ " меньше второго числа " +(b));
//        }
//        System.out.println("Введите первое число:");
//        int a = scanner.nextInt();
//        System.out.println("Введите Второе число:");
//        int b = scanner.nextInt();
//        if (a >= b) {System.out.println("Первое введенное число "+(a)+" больше или равно "+"второго введенного числа "+(b));
//        } else { System.out.println("Первое введенное число " +(a)+ " меньше второго числа " +(b));
//        }
    }
}

