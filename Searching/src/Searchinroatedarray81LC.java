public class Searchinroatedarray81LC {
    public static boolean search(int[] arr, int x) {
        int high= arr.length-1;
        int low=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                return true;
            }
            if (arr[low] == arr[mid] && arr[high] == arr[mid]) {
                low++;
                high--;
                continue; // Skip to the next iteration

            }
            if(arr[mid]>= arr[low]){ //we check which side of the array is sorted.
                if(x>=arr[low] && x<arr[mid]){ // if it holds true, means element lies in left half, else in right half.
                    high=mid-1;
                }
                else
                    low=mid+1;
            }
            else
            if(x>arr[mid] && x<= arr[high]){ // in this condition we see if it lies in the right half, and then continue.
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,0,1,1,1};
        int x=1;
        System.out.println(search(arr,1));
    }
}
