package app;

import java.util.Random;

public class Main {
    public static void sumEven(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) continue;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + sum);
    }
    public static void sumNoneven(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) continue;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + sum);
    }
    public static void prod(int[][] array) {
        long prodEven = 1;
        long prodNonEven = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j % 2 == 0) {
                    prodEven *= array[i][j];
                }
                else {
                    prodNonEven *= array[i][j];
                }
            }
        }
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2): " + prodEven);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): " + prodNonEven);
    }
    public static void magicSquare(int[][] array) {
        int MagicSum = 0;
        for (int i = 0; i < array.length; i++) {
            MagicSum += array[0][i];
        }

        for (int i = 0; i < array.length; i++) {
            int n = 0;
            for (int j = 0; j < array[i].length; j++) {
                n+= array[i][j];
            }
            if (n != MagicSum) {
                System.out.println("Матриця НЕ є магічним квадратом");
                return;
            }
        }
        for (int j = 0; j < array.length; j ++) {
            int m = 0;
            for (int i = 0; i < array.length; i ++) {
                m += array[i][j];
            }
            if (m != MagicSum) {
                System.out.println("Матриця НЕ є магічним квадратом");
                return;
            }
        }
        int d = 0;
        for (int i = 0; i < array.length; i++) {
            d += array[i][i];
        }
        int p = 0;
        for (int i = 0; i < array.length; i ++) {
            p += array[i][array.length - 1 - i];
        }
        if (d != MagicSum || p != MagicSum) {
            System.out.println("Матриця НЕ є магічним квадратом");
            return;
        }
        System.out.println("Матриця Є магічним квадратом");
    }
    public static void main(String args[]) {
        int[][] array = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(51);
            }
        }
        System.out.println("Матриця " + array.length + "x" + array[0].length);
        for (int[] row : array) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
        System.out.println();
        sumEven(array);
        sumNoneven(array);
        prod(array);
        magicSquare(array);
    }
}