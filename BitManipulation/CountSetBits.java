package BitManipulation;

public class CountSetBits {
    static int CountSetBits(int n){
        int res = 0;
        while(n>0)
        {
            if((n&1)!=0) // res = res + (n & 1);
                res++;
            n = n>>1;
        }
        return res;
    }
    // Driver function
    public static void main(String[] args) {
        int n =38654;
        System.out.println(CountSetBits(n));
    }
}
