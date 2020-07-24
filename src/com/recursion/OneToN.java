package com.recursion;
/*Time complexity will be O(0) as we are calling the function for N times
We are calling the function recursively until N-1 becomes 0 */
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
