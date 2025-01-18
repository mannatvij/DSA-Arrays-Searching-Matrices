public class MatrixXcheck {
    boolean MatrixXcheck(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if((i==j) || (i+j==n-1)){ //diagonal elements
                    if(matrix[i][j]==0){
                        return false;
                    }
                }else{
                    if(matrix[i][j]!=0){
                        return false;
                    }

                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        MatrixXcheck matrixa = new MatrixXcheck();
        int matrix[][]= {{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
        boolean b = matrixa.MatrixXcheck(matrix);
        System.out.println(b);
    }
}
