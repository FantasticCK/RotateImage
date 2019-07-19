package com.CK;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{4, 5, 6};
        int[] c = new int[]{7, 8, 9};

        int[][] matrix = new int[3][3];
        matrix[0] = a;
        matrix[1] = b;
        matrix[2] = c;

        Solution solution = new Solution();
        solution.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}

class Solution {
    public void rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0 || matrix.length != matrix[0].length) return;
        reverse(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                swap(matrix, i, j);
            }
        }
    }

    private void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    private void reverse(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < (n / 2); i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[n - i - 1];
            matrix[n - i - 1] = temp;
        }
    }
}