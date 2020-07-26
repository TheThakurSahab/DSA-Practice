package com.recursion;

public class CountDigits {
    static int countDigits(int N){
        if(N<10)
            return 1;
        return 1+countDigits(N/10);
    }
    //Driver Code
    public static void main(String[] args) {
        System.out.println(countDigits(49934));
    }
}
