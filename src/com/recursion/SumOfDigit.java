package com.recursion;

public class SumOfDigit {
    static int Sum(int Digit){
        int Sum =Digit%10;
        if(Digit<10)
            return Digit;
        return Sum+Sum(Digit/10);
    }
    //Driver Code
    public static void main(String[] args) {
        int Digit = 543855;
        System.out.println(Sum(Digit));
    }
}
