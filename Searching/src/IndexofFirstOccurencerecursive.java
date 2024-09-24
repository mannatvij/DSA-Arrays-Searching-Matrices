public class IndexofFirstOccurencerecursive {
    static int BinarysearchfirstIndex(int arr[], int low, int high, int x){
        if(low> high ) return -1;
        int mid = (low+high)/2;
        if(arr[mid]< x)
         return BinarysearchfirstIndex(arr, mid+1, high, x);
        else if(arr[mid] > x)
            BinarysearchfirstIndex(arr, low, mid-1, x);
        else
            if(arr[mid]==0 || arr[mid-1]!=arr[mid]) // we put this condition.
                return mid;
            else
                return BinarysearchfirstIndex(arr, low, mid-1, x);
        return mid;
    }
    public static void main(String args[]){
        int arr[]={10,20,40,40,40,50};
        int x=40;
        System.out.println(BinarysearchfirstIndex(arr, 0, arr.length-1, x));
    }
}
