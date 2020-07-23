import java.util.Scanner;

public class SetBitOff{
    public static void main(String[] args) { ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to be turned off");
        int num = sc.nextInt();
        System.out.println("Enter the position to be off");
        int pos = sc.nextInt();
        int mask = 1 << pos;
        mask = ~mask;
        System.out.println("Digit before turnign off " + Integer.toBinaryString(num));
        num = num & mask;
        System.out.println(Integer.toBinaryString(num));
    }
}