public class leftrotatebyd {
    static void leftrotate(int arr[]) {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
            arr[n - 1] = temp;

    }
        static void leftrotatebyD(int arr[], int d) {
            int n = arr.length;
            for (int i = 0; i < d; i++) {
                leftrotate(arr);
            }
        }
        public static void main(String[] args) {
         int arr[] = {10,20,30,40};
         int d=2;
         System.out.println("Array before rotating:");
         for(int i=0;i<arr.length;i++) {
             System.out.print(arr[i]+" ");
         }
        leftrotatebyD(arr, d);
         System.out.println("\nArray after rotating:");
         for(int i=0;i<arr.length;i++) {
             System.out.print(arr[i]+" ");
         }
        }

}
