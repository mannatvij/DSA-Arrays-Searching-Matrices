public class MatrixdiagonalSum {
    public int diagonalSum(int[][] mat) {
        int n= mat.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+= mat[i][i];
            if(i!=n-i-1){
                sum+= mat[i][n-i-1];
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        MatrixdiagonalSum m = new MatrixdiagonalSum();
        int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(m.diagonalSum(arr));


    }
}