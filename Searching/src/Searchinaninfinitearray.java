public class Searchinaninfinitearray {
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
    static int infinitearraySearch(int arr[] , int x){
        if(arr[0]==x)
            return 0;
        int i=1;
        while(arr[i]< x)
            i=i*2;
            if(arr[i]==x)
                return i;
            return BinarySearch(arr, i/2+1, i-1, x);

    }
    public static void main(String[] args) {
        int arr[]= {10,20,30,40,50,60,80,100,120, 140, 150, 200, 250, 270};
        System.out.println(infinitearraySearch(arr, 100));
    }
}
