import static java.util.Collections.swap;

public class RotateMatrixby90efficent {
    void Rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < m; j++) {
                swap(matrix, i,j);
            }
        }
        //reverse the matrix.
        for(int i = 0; i < m; i++) {
            int low=0;
            int high=m-1;
            while(low<high) {
                swap2(low, high, i, matrix);
                low++;
                high--;
            }
        }
    }
    void swap(int arr[][],int i, int j) {
        int temp= arr[i][j];
        arr[i][j]= arr[j][i];
        arr[j][i]= temp;
    }
    void swap2(int low, int high, int i, int arr[][]){
        int temp= arr[low][i];
        arr[low][i]= arr[high][i];
        arr[high][i]= temp;
    }
    public static void main(String[] args) {
        RotateMatrixby90efficent m = new RotateMatrixby90efficent();
        int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
        m.Rotate(arr);
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
