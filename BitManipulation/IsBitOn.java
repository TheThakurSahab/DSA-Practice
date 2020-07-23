import java.util.*;
public class IsBitOn{
    public static void main(String[] args) { ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to be checked");
        int num = sc.nextInt();
        System.out.println("Enter the position to be checked");
        int pos = sc.nextInt();
        int mask = 1 << pos;
        if((num & mask) == 0){
            System.out.println("Bit is not set");
        }
        else
            System.out.println("Bit is set");
        System.out.println(Integer.toBinaryString(num));
    }
}