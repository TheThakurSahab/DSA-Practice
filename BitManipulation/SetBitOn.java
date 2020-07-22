import java.util.Scanner;

public class SetBitOn{
    public static void main(String[] args) { ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to be turned on");
        int num = sc.nextInt();
        System.out.println("Enter the position to be on");
        int pos = sc.nextInt();
        int mask = 1 << pos;
        System.out.println("Digit before turnign on " + Integer.toBinaryString(num));
        num = num | mask;
        System.out.println(Integer.toBinaryString(num));
    }
}