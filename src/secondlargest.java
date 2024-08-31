public class secondlargest {
    int secondlargest(int arr[], int n) {
        int result = -1;
        int largest = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[largest]) {
                result = largest;
                largest = i;
            } else if (arr[i] < arr[largest]) {
                if (result == -1 || arr[i] > arr[result]) {
                    result = i;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        secondlargest sl = new secondlargest();
        int arr[] = {15, 17, 10, 14};
        int n = arr.length;
        int index = sl.secondlargest(arr, n);

        if (index != -1) {
            System.out.println("The second largest element is " + arr[index] + " at index " + index);
        } else {
            System.out.println("No second largest element found.");
        }
    }
}