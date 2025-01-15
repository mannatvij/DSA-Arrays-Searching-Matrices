public class Matrixboundary {
    void Btraversal(int arr[][]){
        int row = arr.length;
        int colm = arr[0].length;
        //edge cases
        if(row==1){
            for(int i = 0; i< colm; i++){
                System.out.print(arr[0][i]+" ");
            }
        }
        else if(colm ==1){
            for(int i=0; i<row; i++){
                System.out.print(arr[i][0]+" ");
            }
        }
        else {
            for(int i=0; i<colm; i++){
                System.out.print(arr[0][i]+" ");
            }
            for(int i=1; i<row; i++){
                System.out.print(arr[i][colm-1]+" ");
            }
            for(int i= row-2; i>=0; i--){
                System.out.print(arr[i][row-1]+ " ");
            }
            for(int i=colm-2; i>=1; i--){
                System.out.print(arr[0][i]+ " ");
            }
        }

    }
    public static void main(String args[]) {
Matrixboundary mb = new Matrixboundary();

        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
mb.Btraversal(arr);
    }

}
