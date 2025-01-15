public class TwoDArraySameElement {
    public static void main(String[] args) {
        int m=3;
        int n=4;
        int arr[][]= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=i;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();// prints rows sparately.
        }
    }
}
