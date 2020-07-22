public class CountSetBitsBrianAlgo {
    static int CountSetBits(int n){
        int count = 0;
        while (n>0){
            n = (n & (n-1));
            count ++;
        }
        return count;
    }
    // Driver function
    public static void main(String[] args) {
        int n =38654;
        System.out.println(CountSetBits(n));
    }
}
