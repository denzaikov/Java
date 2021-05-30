package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class TicTacToe {

    private static char EMPTY_CELL_SYMBOL = '-';

    public static void start(int field_length) {
        char[][] field = new char[field_length][field_length];

        for (int i = 0; i < field_length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = EMPTY_CELL_SYMBOL;
            }
        }

        drawField(field);

        do {
            doMove(field);
            drawField(field);
            if (isWin(field,'X')) {
                System.out.println("Поздравляем! Вы победили!!!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("Ничья :) ");
                break;
            }

            boolean isWin = doBot(field);
            drawField(field);
            if (isWin) {
                System.out.println("Вы проиграли :-( ");
                break;
            }
            if (isDraw(field)) {
                System.out.println("Ничья :) ");
                break;
            }
        } while (true);
    }

    private static boolean isDraw(char[][] field) {
        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < field.length; y++) {
                if (isEmptyCell(field, x, y)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int[] calcWin(char[][] field, char sign) {
        int[] step = {};

        for (int i = 0; i < field.length * 2 + 2; i++) {
            step = Arrays.copyOf(step, step.length+1);
            step[i] = 0;
        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (i == j && field[i][j] == sign) {
                    step[step.length-2] ++ ;
                }
                if (i + j + 1 == field.length && field[i][j] == sign) {
                    step[step.length-1] ++ ;
                }
                if (field[i][j] == sign) {
                    step[i] ++ ;
                    step[j + field.length] ++ ;
                }
            }
        }
        return step;
    }

    private static boolean isWin(char[][] field, char sign) {

        int[] step = calcWin(field, sign);

        for (int i = 0; i < step.length; i++) {
            if (step[i] >= field.length) {
                return true;
            }
        }
        return false;
    }

    static boolean doBot(char[][] field) {
        int[] playerMove = calcWin(field, 'X');
        int[] botMove = calcWin(field, '0');

        int lineWinners = -1;
        for (int i = 0; i < playerMove.length; i++) {
            if (
                    playerMove[i] >= field.length-1
                            && botMove[i] < 1
            ) {
                lineWinners = i;
                break;
            }
        }

        int x = -1, y = -1;
        if (lineWinners > 0) {
            if (lineWinners < field.length) {
                x = lineWinners;
                for (int i = 0; i < field.length; i++) {
                    if (isEmptyCell(field, x, i)) {
                        y = i;
                    }
                }
            }
            else if (lineWinners >= field.length && lineWinners < playerMove.length - 2) {
                y = lineWinners - field.length;
                for (int i = 0; i < field.length; i++) {
                    if (isEmptyCell(field, i, y)) {
                        x = i;
                    }
                }
            }
            else if (lineWinners == playerMove.length - 2) {

                for (int i = 0; i < field.length; i++) {
                    if (isEmptyCell(field, i, i)) {
                        x = y = i;
                    }
                }
            }
            else {
                    for (int i = 0; i < field.length; i++) {
                    for (int j = 0; j < field.length; j++) {
                        if (i + j + 1 == field.length && isEmptyCell(field, i, j)) {
                            x = i;
                            y = j;
                        }
                    }
                }
            }
        }

        if (lineWinners < 0 || x < 0 || y < 0) {
            Random random = new Random();
            do {
                x = random.nextInt(field.length);
                y = random.nextInt(field.length);
            } while (isNotEmptyCell(field, x, y));
        }
        field[x][y] = '0';
        return isWin(field,'0');
    }

    static boolean doMove(char[][] field) {
        int x, y;
        do {
            y = getCoordinate(field, 'X');
            x = getCoordinate(field, 'Y');
        } while (isNotEmptyCell (field, x, y));

        field[x][y] = 'X';
        return false;
    }

    private static void drawField(char[][] field) {
        for (int i=0; i < field.length; i++) {
            for (int j=0; j < field.length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean isEmptyCell(char[][] field, int x, int y) {
        return field[x][y] == EMPTY_CELL_SYMBOL;
    }

    private static boolean isNotEmptyCell(char[][] field, int x, int h) {
        return !isEmptyCell(field, x, h);
    }

    private static int getCoordinate(char[][] field, char coord_name) {
        Scanner scanner = new Scanner(System.in);
        int coord;
        do {
            System.out.printf("Введите %s-координат [1..%s]%n",coord_name, field.length);
            coord = scanner.nextInt() - 1;
        } while (coord >= field.length || coord < 0);
        return coord;
    }
}