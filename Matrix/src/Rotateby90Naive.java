public class Rotateby90Naive {
    void Rotateby90Naive(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int temp[][]= new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                temp[n-j-1][i]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]= temp[i][j];
            }
        }
    }
    public static void main(String[] args) {
        Rotateby90Naive r = new Rotateby90Naive();
        int matrix[][]= {{1,2,3}, {4,5,6},{7,8,9}};
         r.Rotateby90Naive(matrix);
        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
