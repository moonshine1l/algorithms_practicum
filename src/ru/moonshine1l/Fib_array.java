package ru.moonshine1l;

import java.util.Arrays;

public class Fib_array {

    public static int[] fib(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fib(8)));
    }
}
