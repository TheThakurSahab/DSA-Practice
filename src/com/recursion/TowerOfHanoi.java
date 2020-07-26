package com.recursion;

public class TowerOfHanoi {
    static void TOH(int n, char A, char B, char C){
        if(n==1) {
            System.out.println("Move 1 from rod " + A + " to rod " + C);
            return;
        }
        TOH(n-1, A,C,B);
        System.out.println("Move " +n + " from rod " +A+ " to rod " +C);
        TOH(n-1,B, A, C);
    }
    //Driver code
    public static void main(String[] args) {
        int n=2;
       // char A,B,C;
        TOH(n,'A','B','C');
    }
}
