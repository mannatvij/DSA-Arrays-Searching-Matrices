public class FindInMatrix {
    void FindInMatrix(int[][] matrix, int col) {
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] == col) {
                System.out.println("found at" + i+ j);
                return;
            }
            else
                System.out.println("Element not found.");
        }
    }
    }
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3},{4,5,6},{7,8,9}};
        FindInMatrix findInMatrix = new FindInMatrix();
        findInMatrix.FindInMatrix(matrix,3);
    }
}
