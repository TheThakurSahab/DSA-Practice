public class IsBitOnLeftShift {
    public static void main(String[] args) {
        int n = 13, k = 3;
        //Left shift the number 1 by k-1 and perform AND operation with N
        if((n & (1<<(k-1)))!=0)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
