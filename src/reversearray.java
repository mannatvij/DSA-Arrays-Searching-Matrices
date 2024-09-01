import java.util.*;
public class reversearray {
    static void reverseaaray(int[] arr, int n) {
        int low = 0;
        int high = n - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int arr[]= {10,23,45,89,12};
        int n = arr.length;
        reverseaaray(arr,n);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
