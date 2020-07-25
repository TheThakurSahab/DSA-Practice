package com.recursion;

public class SumOfN {
    //O(n) time complexity
    static int Sum(int n){
        if(n<=1)
            return n;
        return n+Sum(n-1);
    }
    //O(1) time complexity
    static int SumBetter(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args) throws Exception {
        int n = 5;
        System.out.println(Sum(n));
        System.out.println(SumBetter(n));
    }
}
