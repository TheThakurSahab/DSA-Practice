package com.recursion;
/*Time complexity will be O(0) as we are calling the function for N times
We are calling the function recursively until N-1 becomes 0 */
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
