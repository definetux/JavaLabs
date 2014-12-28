package com.lab1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final int SIDE = 10;
    public static final char DEFAULT_MARK = '*';
    public static final char PATH_MARK = 174;

    public static void main(String[] args) throws IOException {
        char[][] field = new char[SIDE][SIDE];

        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                field[i][j] = DEFAULT_MARK;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x1, x2, y1, y2;

        do {
            System.out.println("Введите х1 (1..10)");
            x1 = Integer.parseInt(br.readLine());
        } while (!check(x1));
        do {
            System.out.println("Введите y1 (1..10)");
            y1 = Integer.parseInt(br.readLine());
        } while (!check(y1));
        do {
            System.out.println("Введите x2 (1..10)");
            x2 = Integer.parseInt(br.readLine());
        } while (!check(x2));
        do {
            System.out.println("Введите y2 (1..10)");
            y2 = Integer.parseInt(br.readLine());
        } while (!check(y2));

        int horizontalLength = x2 - x1;
        int verticalLength = y2 - y1;

        int row = x1 - 1;
        int column = y1 - 1;

        while (row != x2 - 1 || column != y2 - 1) {
            field[row][column] = PATH_MARK;
            if (horizontalLength > 0) {
                row++;
                horizontalLength--;
            } else if (horizontalLength < 0){
                row--;
                horizontalLength++;
            }
            if (verticalLength > 0) {
                column++;
                verticalLength--;
            } else if (verticalLength < 0) {
                column--;
                verticalLength++;
            }
        }
        field[row][column] = PATH_MARK;

        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean check(int coordinate) {
        return coordinate > 0 && coordinate <= SIDE;
    }
}
