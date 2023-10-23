package ru.moonshine1l;

public class Fib_binet {
    public static int fib(int n) {
        double a = Math.sqrt(5);
        double b = (1 + a)/2;
        int result = (int) ((Math.pow(b, n) - Math.pow(-b, -n))/a);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fib(32));
    }
}
