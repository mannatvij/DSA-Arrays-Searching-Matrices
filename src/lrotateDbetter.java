public class lrotateDbetter {
  static void rotated(int arr[], int d){
        int n = arr.length;
        int temp[]= new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d]= arr[i];
        }
        for(int i=0;i<d;i++){
            arr[n-d+i]=temp[i];
        }
    }
    public static void main(String args[]){
         int arr[]= {10,20,30,40};
         int d=2;
         int n=arr.length;
        System.out.println("Before rotated array:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        rotated(arr, d);
        System.out.println("After rotated array:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
