package com.recursion;

public class NToOne {
    static void NToOne(int Num){
        if(Num==0)
            return;
        System.out.println(Num);
        NToOne(Num-1);
    }
    //Driver COde
    public static void main(String[] args) {
        int Num = 10;
        NToOne(Num);
    }
}
