public class LC1351countnumberofnegelement {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j< grid[i].length; j++){ //in grid question in second loop you use length as [i] aslo, when the rows and columns are unequal.
                if(grid[i][j] <0)
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int grid[][]={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(new LC1351countnumberofnegelement().countNegatives(grid));
    }
}
