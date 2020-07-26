package com.recursion;

public class SumSubsets {
    static int countSubsets(int[] arr, int n, int sum) {
        if (n == 0)
            return (sum == 0) ? 1 : 0;
        return countSubsets(arr, n - 1, sum) +
                countSubsets(arr, n - 1, sum - arr[n - 1]);
    }
    //Driver code
    public static void main(String[] args) {
        int[] arr = {10,20,25};
        int n =25, sum =0;
        System.out.println(countSubsets(arr,n,sum));
    }
}
