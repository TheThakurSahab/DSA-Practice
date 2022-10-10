Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.
  
  
  
public class Solution {
    public int solve(int[] A) {
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE, ans=Integer.MAX_VALUE;
        int latest_min=-1, latest_max=-1, N=A.length;
        for(int x:A){
            min = Math.min(min, x);
            max = Math.max(max, x);
        }for(int j=N-1;j>=0;j--){
            if(A[j]==min){
                latest_min =j;
                if(latest_max!=-1){
                    ans = Math.min(ans,latest_max-latest_min+1);
                }
            }if(A[j]==max){
                latest_max =j;
                if(latest_min!=-1){
                    ans = Math.min(ans,latest_min-latest_max+1);
                }
            }
        }
        return ans;
    }
}
