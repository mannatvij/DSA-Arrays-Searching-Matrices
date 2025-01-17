public class FindinMatrixbinary {
    void FindinMatrix(int arr[][], int x) {
        int i = 0;
        int j = arr[0].length - 1;
        while (i<arr.length && j>=0) {

            if (arr[i][j] == x) {
                System.out.println("Found at(" + i +" , " +j+ ")");
                return;
            }
            else if(arr[i][j]<x){
                i++;
            }
            else
                j--;
        }
    }
    public static void main(String[] args) {
        FindinMatrixbinary obj = new FindinMatrixbinary();
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        obj.FindinMatrix(arr,3);

    }
}
