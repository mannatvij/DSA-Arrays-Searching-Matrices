public class LastIndexOfoccurencerec {
    static int BinarySearch(int arr[], int low, int high, int x) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] < x)
            return BinarySearch(arr, mid + 1, high, x);

        else if (arr[mid]  > x)
            return BinarySearch(arr, low, mid - 1, x);
        else {
            if (mid == arr.length - 1 || arr[mid + 1] != arr[mid])
                return mid;
            else return BinarySearch(arr, mid + 1, high, x);

        }

    }
    public static void main(String[] args) {
        int arr[]= {10,20,30,40,40,40,50};
        int x= 40;
        System.out.println(BinarySearch(arr, 0, arr.length-1, x));
    }
}
