package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '.';
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static char[][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static int numberOfLines;
    private static int numberOfColumns;
    private static int numberOfChips = 3;
/*
    private static void enterSizeField() {
        do {
            System.out.println("Введите (числами от 3 до 10): размер игрового поля по горизонтали, по вертикали и количество фишек для победы");
            numberOfLines = SCANNER.nextInt();
            numberOfColumns = SCANNER.nextInt();
            numberOfChips = SCANNER.nextInt();
        } while (!isValidField(numberOfLines, numberOfColumns, numberOfChips));
    }

    private static boolean isValidField(int x, int y, int n) {
        return x >= 3 && x < fieldSizeX && y >= 3 && y < fieldSizeY && n >= 3 && n <= x && n <= y;
    }

    private static void initField() {
        fieldSizeY = 10;
        fieldSizeX = 10;
        enterSizeField();
        field = new char[numberOfColumns][numberOfLines];
        for (int y = 0; y < numberOfColumns; y++) {
            for (int x = 0; x < numberOfLines; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        for (int i = 0; i < numberOfColumns; i++) {
            System.out.print("|");
            for (int j = 0; j < numberOfLines; j++)
                System.out.print(field[i][j] + "|");
            System.out.println();
        }
    }
*/
    private static boolean checkWin(char c) {
        boolean diagonalLeft = true;
        boolean diagonalRight = true;
        for (int i = 0; i < numberOfChips; i++) {
            diagonalLeft &= (field[i][i] == c);
            diagonalRight &= (field[i][numberOfChips - 1 - i] == c);
        }
        if (diagonalLeft || diagonalRight) return true;

        for (int i = 0; i < numberOfChips; i++) {
            boolean vertical = true;
            boolean horizontal = true;
            for (int j = 0; j < numberOfChips; j++) {
                vertical &= (field[i][j] == c);
                horizontal &= (field[j][i] == c);
            }
            if (vertical || horizontal) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        //initField();
        //printField();
        //if (checkWin(DOT_AI)) System.out.println("Computer win!");
    }

}
