Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.



Problem Constraints
1 <= N <= 1e6
-1000 <= A[i] <= 1000



Input Format
The first and the only argument contains an integer array, A.



Output Format
Return an integer representing the maximum possible sum of the contiguous subarray.
  
  
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int n = A.length, cur_sum=0, max_sum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            cur_sum += A[i];
            max_sum = Math.max(cur_sum, max_sum);
            if(cur_sum<0)
            cur_sum = 0;
        }
        return max_sum;
    }
}
  
