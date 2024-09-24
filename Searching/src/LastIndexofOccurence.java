public class LastIndexofOccurence {
    static int BinarySearch(int[] arr, int low, int high, int x) {
        int n= arr.length;
        while(low< high) {
            int mid = (low + high) / 2;
            if (arr[mid] < x)
                low = mid + 1;
             else if (arr[mid] > x)
                high = mid - 1;
            else {
            if (mid == n - 1 || arr[mid + 1] != arr[mid])
                return mid;
            else
                low = mid + 1;
        }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,40,40,50};
        int x=40;
        System.out.println(BinarySearch(arr,0,arr.length-1,x));
    }
}
