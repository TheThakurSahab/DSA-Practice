public class PowerSet {
    static void PowerSet(String str){
        int n =str.length();
        int powSize = (int)Math.pow(2,n);
        for(int counter=0;counter<powSize;counter++){
            for(int j=0;j<n;j++){
                if((counter & (1<<j)) != 0)
                    System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
    //Driver code
    public static void main(String[] args) {
        String name = "RAM";
        PowerSet(name);
    }
}
