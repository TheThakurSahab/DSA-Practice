package com.recursion;

public class GenerateSubsets {
    static void SubSets(String str, String current, int index){
        if(index==str.length()) {
            System.out.println(current + " ");
            return;
        }
        /* Two cases for every character
         (i) We consider the character as part of current subset
        (ii) We do not consider current character as part of current subset */
        SubSets(str,current+str.charAt(index), index+1);
        SubSets(str,current, index+1);

    }
    //Driver code
    public static void main(String[] args) {
        String str = "abc";
        int index =0;
        String current = "";
        SubSets(str,current ,index);
    }
}
