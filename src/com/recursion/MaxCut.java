package com.recursion;
import java.util.*;
public class MaxCut {
    static int maxCut(int n, int a, int b, int c){
        if(n==0)
            return 0;
        if(n<0)
            return -1;
        int res = Math.max(maxCut(n-a, a, b, c),Math.max(maxCut(n-b,a,b,c), maxCut(n-c,a, b, c)));
        if(res==-1)
            return -1;
        return res+1;
    }
    //Driver code
    public static void main(String[] args) {
        int n=23,a=11,b=9,c=1;
        System.out.println(maxCut(n,a,b,c));
    }
}
