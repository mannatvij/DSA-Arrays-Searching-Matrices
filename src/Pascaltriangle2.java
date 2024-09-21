import java.util.ArrayList;
import java.util.List;

public class Pascaltriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // add first element one
        for (int i = 1; i <= rowIndex; i++) { //one pointer from starting 1,
            for (int j = row.size() - 1; j > 0; j--) { // other pointer from last.
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1);
        }
        return row;
    }
    public static void main(String[] args) {
        Pascaltriangle2 p = new Pascaltriangle2();
        List<Integer> row = p.getRow(4);
        System.out.println(row);
    }
}
