public class Leftrotatebyone {
   static int lrotateOne(int[] arr){
        int n = arr.length;
        int temp = arr[0];
        for(int i=1;i<n;i++) {
            arr[i - 1] = arr[i];
        }
            arr[n-1]= temp;

       return n;
   }
    public static void main(String args[]) {
        int arr[] = {12, 13, 14, 19};

        Leftrotatebyone obj = new Leftrotatebyone();
       int c= obj.lrotateOne(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
