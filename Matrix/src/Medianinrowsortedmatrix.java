public class Medianinrowsortedmatrix {
    void Median(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        int min= arr[0][0];
        int max= arr[0][n-1];
        for(int i=0;i<m;i++){
            if(arr[i][0]< min){
                min= arr[i][0];
            }
            if(arr[i][n-1] > max){
                max= arr[i][n-1];
            }
        }
        int midPos=((m*n) -1)/2;
        while(min<max){

        }
    }

}
