public class SpiralMatrix {
    void SpiralMatrix(int mat[][]) {
        int row= mat.length;
        int col= mat[0].length;
        int top=0; //it is first row
        int bottom = row-1; //last row
        int left=0; //first colm
        int right = col-1; //last coln
        while(top<=bottom && left<=right){
            //left to right
            for(int i=left; i<=right;i++){
                System.out.print(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bottom; i++){
                System.out.print(mat[i][right]);
            }
            right--;
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(mat[bottom][i]);
                }
            }
                bottom--;
                if(left<=right){
                    for(int i= bottom; i>=top; i--) {
                        System.out.print(mat[i][left]);
                    }
                        left++;

                }

        }

    }
    public static void main(String[] args) {
        SpiralMatrix matrix = new SpiralMatrix();
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        matrix.SpiralMatrix(arr);

    }
}
