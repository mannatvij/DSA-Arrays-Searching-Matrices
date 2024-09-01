public class issorted {
    boolean issorted(int arr[] , int n){
        for(int i=0; i< arr.length-1; i++){
            if(arr[i]> arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int arr[]= {10,20,30,40};
        int n=arr.length;
        issorted obj= new issorted();
       boolean result= obj.issorted(arr, n);

        if(result) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
