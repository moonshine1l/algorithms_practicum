package ru.moonshine1l;

import java.math.BigInteger;

public class Fib_big_even_odd {

    public static BigInteger[][] matrixMultiplication(BigInteger[][] a, BigInteger[][] b) {
        return new BigInteger[][]{
                {a[0][0].multiply(b[0][0]).add(a[0][1].multiply(b[1][0])), a[0][0].multiply(b[0][1]).add(a[0][1].multiply(b[1][1]))},
                {a[1][0].multiply(b[0][0]).add(a[1][1].multiply(b[1][0])), a[1][0].multiply(b[0][1]).add(a[1][1].multiply(b[1][1]))},
        };
    }

    public static BigInteger[][] matrixPowerFast(BigInteger[][] a, int n) {
        if (n == 0) {
            return new BigInteger[][]{
                    {BigInteger.ONE, BigInteger.ZERO},
                    {BigInteger.ZERO, BigInteger.ONE}
            };
        } else if (n % 2 == 0) {
            return matrixPowerFast(matrixMultiplication(a, a), n / 2);
        } else {
            return matrixMultiplication(matrixPowerFast(a, n - 1), a);
        }
    }

    public static BigInteger fib_eo(int n) {
        if (n == 0) {
            return BigInteger.ZERO;
        }
        BigInteger[][] a = {
                {BigInteger.ONE, BigInteger.ONE},
                {BigInteger.ONE, BigInteger.ZERO}
        };
        BigInteger[][] powerOfA = matrixPowerFast(a, n - 1);
        BigInteger nthFibonacci = powerOfA[0][0];
        return nthFibonacci;
    }

    public static void main(String[] args) {
        String a = fib_eo(841645).remainder(BigInteger.valueOf(10)).toString();
        int i = Integer.parseInt(a.trim());
        if (i % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}


