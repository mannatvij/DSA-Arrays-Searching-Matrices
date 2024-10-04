public class Mininrotatedsortedarray {
    public int findMin(int[] arr) {
        int high= arr.length-1;
        int low=0;
        int min=arr[0];
        while(low<high){
            int mid=(low+high)/2;

            if(arr[mid]> arr[high]){ //meaning min is in the right half
                low=mid+1;
            }
            else //MEANING MIN IS IN THE LEFT HALF;
                high=mid;
        }
        return arr[low]; //after the loop, low should point to the minimum element.
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7,8,1,2};
        Mininrotatedsortedarray obj=new Mininrotatedsortedarray();
        System.out.println(obj.findMin(arr));
    }
}
