package BitManipulation;

public class PowerOfTwo {
    static boolean PowerOfTwo(int n){
        if (n<=0)
            return false;
        while(n!=1)
        {
            if(n%2 !=0)
                return false;
            n /=2;
        }
        return true;
    }
    // Driver function
    public static void main(String[] args) {
        int n =11;
        System.out.println(PowerOfTwo(n));
    }
}
