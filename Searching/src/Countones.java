public class Countones {
    static int Countones(int arr[], int n){

        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==0)
                low=mid+1; // if value is 0, move towards right

            else
                if(mid==0 || arr[mid-1]==0)
                    return (n-mid); // if first is 0, or previous element is zero return n-mid. else shift to left to check again./
                    else
                        high= mid-1;
        }
        return 0;
    }
    public static void main(String args[]){
        int arr[]= {0,0,0,0,1,1,1,1,1};
int n=9;
        System.out.println(Countones(arr,n));
    }
}
