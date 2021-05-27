package HomeWorkApp;

import java.util.Arrays;
import java.util.Random;

public class lesson3 {

    public static void main(String[] args) {
        System.out.println("Задание №1");
    task1();
        System.out.println(Arrays.toString(task1()));

        System.out.println("Задание №2");
    task2();
        System.out.println(Arrays.toString(task2()));
        System.out.println("Задание №3");
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    task3(array);
        System.out.println("Задание №4");
    task4();
        System.out.println("Задание №5");
   task5(8,4);
   task5(6,3);

//    Task8(1, 1,2,3);
    }

    /*
    ** Задать целочисленный массив,
    * состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    static int[] task1() {

        int[] arr = new int [10];
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextInt(2);
            if (arr[i] == 1) {
                arr[i] = 0;
            } else { arr[i]=1;}
        }
        return arr;
    }

    /*
    Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */

    static int[] task2() {

        int[] arr = new int [100];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = i;
//            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        return arr;
    }

    /*
    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
     и числа меньшие 6 умножить на 2;
     */

    static int[] task3(int[] array) {

        for(int i = 0; i < array.length; i++)
        {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
//            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println(Arrays.toString((array)));
        return array;
    }
    /*
    Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу:
     индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    static void task4(){

        Random rand = new Random();
        int min = 2;
        int max = 9;
        int[][] arr = new int [5][5];
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++)
            {
                if (i == j || j == arr[i].length - 1 -i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j]= rand.nextInt((max - min) + 1) + min;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*
    Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
     */
    public static int task5(int len, int initialValue) {

        int[] arr = new int [len];
        int i;
        for(i = 0; i < len; i++)
        {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr[initialValue];
    }
    /*
    Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
             при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
             Для усложнения задачи нельзя пользоваться вспомогательными массивами.
         Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
         При каком n в какую сторону сдвиг можете выбирать сами.
     */
    static void Task8(int step, int... array){
    System.out.println("Задание №8");
        int index = 0;
        int recordOld = 0;
        int recordNew = 0;
        for (int i = 0; i < array.length; i++)
        for (int j = 0; j <array.length; j++)

        {

//            recordNew = array[index];
//            recordOld = array[index + step];
//            array[index + step] = recordNew;
//            if (step != array.length) {
//                index = index + step;
//            } else {
//                index = 0;
//            }
        }

    }
}