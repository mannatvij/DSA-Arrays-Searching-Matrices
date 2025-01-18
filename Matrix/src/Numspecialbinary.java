public class Numspecialbinary {
    public int numspecialbinary(int mat[][]) {
        int m = mat.length;
        int n = mat[0].length;
        int row[]= new int[m];
        int col[]= new int[n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1 && row[i]==1 && col[j]==1){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Numspecialbinary obj = new Numspecialbinary();
        int mat[][]= {{1,0,0},{0,0,1},{1,0,0}};
        System.out.println(obj.numspecialbinary(mat));
    }
}
