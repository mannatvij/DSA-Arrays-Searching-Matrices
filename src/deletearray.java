public class deletearray {
    static int deleteele(int arr[], int n, int x) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
            }
            break;
        }
        if (i == n) { // meaning the iterator reached the end. therefore not found element.
            return n;
        }
        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }
return n-1;

    }
    public static void main(String[] args) {
        int arr[]= {15, 17, 10, 14} , x =15, n=4;
        System.out.println("THe array before deletion:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        n = deleteele(arr, n, x);
        System.out.println("\nTHe array after deletion:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

