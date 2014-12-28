package com.lab1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number: ");
        try {
            String line = bf.readLine();
            BigNumbers bn = new BigNumbers(true); // Если true - представить большое маленькими числами, иначе звуздочками
            char[][][] numbers = new char[line.length()][][];

            // Для каждой цифры введенной строки получить ее представление
            for (int i = 0; i < line.length(); i++){
                numbers[i] = bn.getNumber(Character.digit(line.charAt(i), 10));
            }

            // Вывести большие цифры
            bn.printNumbers(numbers);
        } catch (IOException e) {

            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input. String must contain only digits.");
            e.printStackTrace();
        }
    }
}
