package com.lab1;

/**
 * Created by mgoncharuk on 27.12.14.
 */
public class ArrayUtils {

    public int[][] getSpiral(int side){
        int[][] array = new int[side][side];
        int number = 1;
        int path = side; // length of side

        int row = -1, column = 0; // start position

        int dir = 1; // direction

        while (path != 0) {
            int i = 0;

            // move right
            for (; i < path; i++, number++) {
                row += dir;
                array [column][row] = number;
            }
            i = 0;
            path--;

            // move down
            for (; i < path; i++, number++) {
                column += dir;
                array [column][row] = number;
            }
            dir *= -1; // toggle direction
        }
        return array;
    }

    public void printArray(int[][] array){
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.format("%3d ", array[i][j]);
            }

            System.out.println();
        }
    }
}
