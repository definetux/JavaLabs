package com.lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        int length = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter matrix side: ");
        try {
            length = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayUtils arrayUtils = new ArrayUtils();

        int[][] array = arrayUtils.getSpiral(length);
        arrayUtils.printArray(array);
    }
}
