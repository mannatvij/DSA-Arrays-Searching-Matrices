public class Onedarrayto2D {
    public int[][] Convert(int arr[], int m, int n){
        int r= arr.length;
        if(m*n!=r){
            return new int[0][];
        }
        int result[][]= new int[m][n];
        for(int i=0; i< m*n; i++){
            result[i/n][i%n]= arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6};
        int m=2;
        int n=3;
        Onedarrayto2D ob = new Onedarrayto2D();
        int[][] result= ob.Convert(arr, m, n);
        for(int i=0; i< m; i++){
            for(int j=0; j<n; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }

}
