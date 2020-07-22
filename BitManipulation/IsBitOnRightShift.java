
public class IsBitOnRightShift {
    public static void main(String[] args) {
        int n = 13, k = 3;
        //Right shift the number N by k-1 and perform AND operation with 1
        if((n>>(k-1)&1)==1)
            System.out.print("Yes");
        else
            System.out.print("No");
    }

}
