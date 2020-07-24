package com.recursion;

public class OneToN {
    static void OneToN(int Num){
        if(Num==0)
            return;
        OneToN(Num-1);
        System.out.println(Num);
    }
    //Driver COde
    public static void main(String[] args) {
        int Num = 10;
        OneToN(Num);
    }
}
