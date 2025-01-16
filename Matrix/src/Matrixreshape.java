public class Matrixreshape {
    static int[][] Reshape(int arr[][], int r, int c){
        int m = arr.length;
        int n = arr[0].length;
        if(r*c != m*n){
            return arr;
        }
        int result[][]= new int[r][c];
        for(int i = 0; i < r*c; i++){
            result[i/c][i%c]= arr[i/n][i%n];
        }
        return result;
    }
    public static void main(String args[]){
        Matrixreshape obj = new Matrixreshape();
        int arr[][]= {{1,2,3},{4,5,6}};
        int r=1;
        int c= 6;
       int result[][]= Reshape(arr,r,c);
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(result[i][j]+" ");
            }
        }
    }


}
