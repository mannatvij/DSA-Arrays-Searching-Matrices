import java.util.ArrayList;
import java.util.List;

public class SnakeinamatrixLC {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int x=0; //no. of rows;
        int y=0; //no. of columns.
        for(String s : commands) {
            String command = s.toUpperCase();
            switch(command) {
                case "UP":
                    x--;
                    break;
                case "DOWN":
                    x++;
                    break;
                case "LEFT":
                    y--;
                    break;
                case "RIGHT":
                    y++;
                    break;
            }

        }
        return (x*n) +y;

    }
    public static void main(String[] args) {
        SnakeinamatrixLC s = new SnakeinamatrixLC();
        List<String> commands = new ArrayList<String>();
        commands.add("UP");
        commands.add("DOWN");
        commands.add("RIGHT");
        commands.add("RIGHT");

        int n=4;
        int result= s.finalPositionOfSnake(n, commands);
        System.out.println(result);
    }
}
