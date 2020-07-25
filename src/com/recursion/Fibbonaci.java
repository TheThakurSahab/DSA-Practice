package com.recursion;

class Fibbonaci {
    static long Fib(int n) {
        if (n <= 1) return n;
        //if (n == 1) return 1;
        return Fib(n - 1) + Fib(n - 2);
    }

    public static void main(String[] args) throws Exception {
        int n = 7;
        System.out.println(Fib(n));
    }
}
