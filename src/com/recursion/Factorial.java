package com.recursion;

class Factorial {
    static long Fac(int n) {
        if (n == 0) return 1;
        return Fac(n - 1)*n;
    }

    public static void main(String[] args) throws Exception {
        int n = 7;
        System.out.println(Fac(n));
    }
}
