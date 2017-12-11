package com.company;

enum SORT_DIRECTION {MIN, MAX};

public class Main {

    public static void main(String[] args) {

        int[] array = {3, 8, 3, 9, 11, 2};
        int[][] matrix = {{1, 0, 1}, {0, 0, 4}};

        //bubbleSort(array,SORT_DIRECTION.MAX);
        printMatrix(matrix);
        //bubbleSortReverse(array);
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i] + " ");
//        }
    }


    public static void bubbleSort(int[] array, SORT_DIRECTION sort_direction) {
        for (int i = (array.length - 1); i > 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                int helper = 0;
                if (sort_direction.equals(SORT_DIRECTION.MAX)) {
                    if (array[j] < array[j + 1]) {
                        helper = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = helper;
                    }
                } else {
                    if (array[j] > array[j + 1]) {
                        helper = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = helper;
                    }
                }

            }

        }
    }

    public static void bubbleSortReverse(int[] array) {
        for (int i = (array.length - 1); i > 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                int helper = 0;
                if (array[j] < array[j + 1]) {
                    helper = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = helper;
                }
            }

        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == matrix[i].length - 1) {
                    System.out.println(matrix[i][j]);
                } else {
                    System.out.print(matrix[i][j]);
                }
            }
        }
    }

}
