public class Searchinaroatatedarray {
    static int rotatedarraysearch(int arr[], int x){
        int high= arr.length-1;
        int low=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]>= arr[low]){ //we check which side of the array is sorted.
                if(x>=arr[low] && x<=arr[mid]){ // if it holds true, means element lies in left half, else in right half.
                    high=mid-1;
                }
                else
                    low=mid+1;
            }
            else
                if(x>=arr[mid] && x<= arr[high]){ // in this condition we see if it lies in the right half, and then continue.
                    low=mid+1;
                }
                else
                    high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {10,20,40,60,5,8};
        int x= 5;
        System.out.println(rotatedarraysearch(arr,x));
    }
}
