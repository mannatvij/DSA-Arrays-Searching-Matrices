public class Countoccurences {
    static int FirstOcc(int arr[], int n, int x) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < x)
                low = mid + 1;

            else if (arr[mid] > x)
                high = mid - 1;
            else if (mid == 0 || arr[mid - 1] != arr[mid])
                return mid;

            else
                high = mid - 1;


        }
        return -1;
    }

    static int LastOcc(int arr[], int n, int x) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < x)
                low = mid + 1;

            else if (arr[mid] > x)
                high = mid - 1;
            else if (mid == n - 1 || arr[mid + 1] != arr[mid])
                return mid;

            else
                low = mid + 1;
        }
        return -1;
    }
    static int CountOcc(int arr[], int n, int x){
       int first= FirstOcc(arr,n,x);
       if(first==-1)
           return 0;
       else return LastOcc(arr,n,x) -first +1;
    }
    public static void main(String[] args) {
        int arr[]={10,10,20,20,40,40,40,50};
        int n = arr.length;
        int x = 40;
        System.out.println(CountOcc(arr,n,x));
    }
}
