public class TransposeEfficent {
    void swap(int arr[][], int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    void Transpose(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr[i].length; j++){
                swap(arr, i, j);
            }
        }
    }
    public static void main(String[] args) {
        TransposeEfficent t = new TransposeEfficent();
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        t.Transpose(arr);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
