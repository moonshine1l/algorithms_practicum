package ru.moonshine1l;

public class Fib_loop {

    static int prev = 0;
    static int next = 1;

    public static int fib(int n) {
        for(int i = 0; i < n; i++){
            int temp = next;
            next = prev + next;
            prev = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        System.out.println(fib(7));
    }
}
