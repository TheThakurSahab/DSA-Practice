package com.recursion;
//Time complexity will be O(n) because we are breaking the problem further by N-1 until N becomes 0
public class Josephus {
    static int Jos(int N, int K){
        if(N==1)
            return 0;
        else
            return ((Jos(N-1,K)+K)%N);
    }
    //Driver Code
    public static void main(String[] args) {
        int K = 5, N=3;
        System.out.println(Jos(K,N));
    }
}
