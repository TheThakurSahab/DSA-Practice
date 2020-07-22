import java.util.Scanner;

public class ToggleBit{
    public static int countNo(int n){
        if (n == 0)
        {
            return 0;
        }
        return 1 + countNo(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to be toggled");
        int num = sc.nextInt();
        System.out.println("Enter the position to be toggled");
        int pos = sc.nextInt();
        int mask = 1 << pos;
        System.out.println("Digit before toggling  \n" + Integer.toBinaryString(num));
        num = num ^ mask;
        System.out.println("Digit After toggling  \n" + Integer.toBinaryString(num));
        int n = 1876638;
        System.out.println(countNo(n));
    }
}