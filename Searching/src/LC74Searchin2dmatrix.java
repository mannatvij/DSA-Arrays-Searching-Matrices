public class LC74Searchin2dmatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row= matrix.length;
        int col= matrix[0].length;
        int start=0;
        int end= row*col-1; //way to represent in 2d.
        while(start<=end){
            int mid= (start+end)/2;
            int element = matrix[mid / col][mid % col];// this is done to convert mid 1 d matrix to 2d matrix.
            if (element == target) {
                return true;
            }

            if (element < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LC74Searchin2dmatrix sol = new LC74Searchin2dmatrix();
        System.out.println(sol.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 10));

    }
}
