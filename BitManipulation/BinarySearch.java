public class BinarySearch {
    public static int Binary_Search(int arr[], int Search){
        int low = 0, high = arr.length-1, mid = (low+high)/2;
        if(arr[mid]<Search){
            high = mid;
        }
        else if(arr[mid]>Search){
            low = mid;
        }
        else if(arr[mid]==Search){
            return mid;
        }
        return -1;
    }
    //Driver code
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12};
        int Serch = 2;
        System.out.println(Binary_Search(arr, Serch));
    }
}
