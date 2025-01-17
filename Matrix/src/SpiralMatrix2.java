public class SpiralMatrix2 {
    static int[][] SpiralMatrix2(int n) {
        int [][] mat= new int[n][n];
        int top= 0;
        int bottom= mat.length-1;
        int left= 0;
        int right= mat[0].length-1;
        int val=1;
        while(top<=bottom && left<=right){
            for(int i=left; i<=right; i++){
                mat[top][i]= val;
                val= val+1;
            }
            top++;
            for(int i=top; i<=bottom; i++){
                mat[i][right]= val;
                val= val+1;
            }
            right--;
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    mat[bottom][i] = val;
                    val = val + 1;
                }
                bottom--;
            }
            if(left<=right) {
                for(int i=bottom; i>=top; i--){
                    mat[i][left]= val;
                    val = val + 1;
                }
                left++;
            }

        }
        return mat;
    }
    public static void main(String[] args) {

        int n=3;
        int result[][]= SpiralMatrix2(n);
        for(int i=0; i<result.length; i++) {
            for(int j=0; j<result[i].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
