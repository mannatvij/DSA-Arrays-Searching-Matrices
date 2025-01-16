public class JaggedTwoDarray {
    public static void main(String[] args) {
        int m = 3;
        int arr[][] = new int[m][];
        for (int i = 0; i < m; i++) {
            arr[i] = new int[i + 1]; //allocating within an array a new array! refer to next comment.
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i; // same elements as row no. same no. of elements and there value also equal to the row no.
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
