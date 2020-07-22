package BitManipulation;

public class OneOddOccuring {
    static int OneOdd(int[] arr){
        int res = 0;
        for(int i=0;i<arr.length;i++){
            res =  res^arr[i];
        }
        return res;
    }
    //Driver Code
    public static void main(String[] args) {
        int arr[] = {4,5,4,5,4,4,4,5,5};
        System.out.println(OneOdd(arr));
    }
}
