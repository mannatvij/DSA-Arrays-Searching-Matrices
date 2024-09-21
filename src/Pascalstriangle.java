import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pascalstriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0)
            return result;
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1); // add first element one
        result.add(firstRow); // add first row to result.
        if (numRows == 1)
            return result;
        for (int i = 1; i < numRows; i++) {
            List<Integer> PrevRow = result.get(i - 1);
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 0; j < i - 1; j++) {
                row.add(PrevRow.get(j) + PrevRow.get(j + 1));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
    public static void main(String[] args) {
        Pascalstriangle p = new Pascalstriangle();
        System.out.println(p.generate(3));
    }
}
