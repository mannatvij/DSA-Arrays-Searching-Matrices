public class TransposeNaive {
    //only for square matrixes. in case of normal, just take temp and sotre value of its (j,i) in arrays i,j
    void Transpose(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        //traverse through the array, and take a temp array store values of i j as ji in it.
        int temp[][]= new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                temp[i][j]= arr[j][i];
            }

        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) {
                arr[i][j] = temp[i][j];
            }
        }

    }
    public static void main (String args[]){
        TransposeNaive obj = new TransposeNaive();
        int arr[][]= {{1,2,3}, {4,5,6},{7,8,9}};
        obj.Transpose(arr);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


}
