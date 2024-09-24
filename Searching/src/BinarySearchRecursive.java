public class BinarySearchRecursive {
    static int BinarySearch(int arr[], int low, int high, int x){
        if(low> high)
            return -1;
            int mid = (low + high)/2;
            if(arr[mid] == x)
                return mid;
            else if(arr[mid] > x)
                return BinarySearch(arr, low, mid - 1, x);
            else
                return BinarySearch(arr, mid + 1, high, x);
    }
public static void main(String[] args) {
        int arr[]= {10,20,30,40,50};
        System.out.println(BinarySearch(arr, 0, arr.length-1, 20));
}
}
