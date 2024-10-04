public class Mininroatedarraydulpicates {//leetcode 154.
    //same but may include duplicates.
    public static int findMin(int[] arr) {
        int high= arr.length-1;
        int low=0;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]==arr[low] && arr[mid]==arr[high]){
                low++;
                high--;
            }
            else if(arr[mid]> arr[high]){ //meaning min is in the right half
                low=mid+1;
            }
            else //MEANING MIN IS IN THE LEFT HALF;
                high=mid;
        }
        return arr[low]; //after the loop, low should point to the minimum element.
    }
public static void main(String args[]) {
    int arr[]={1,0,0,1,1,0};
    System.out.println(findMin(arr));
}

}
