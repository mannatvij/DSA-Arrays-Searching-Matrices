public class IsTopezian {
    public boolean isToeplitzMatrix(int[][] matrix) {

        int row =matrix.length;
        int col= matrix[0].length;
        if(row*col==1){
            return true;
        }
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(matrix[i][j]!= matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        IsTopezian isTopezian = new IsTopezian();
        int[][] matrix = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(isTopezian.isToeplitzMatrix(matrix));
    }
}
