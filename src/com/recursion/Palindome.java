package com.recursion;
//Time complexity would be O(n) where N is the no of char in the string
public class Palindome {
    static boolean checkPalindrom(String Str, int Start, int End){
        int n = Str.length();
        if (Start>=End)
            return true;
            return ((Str.charAt(Start)==Str.charAt(End)) && checkPalindrom(Str, Start+1,End-1));
    }
    //Driver code
    public static void main(String[] args) {
        String str = "abaababa";
        int len = str.length();
        int Start =0, End = len-1;
        System.out.println(checkPalindrom(str,Start,End));
    }
}
