import java.util.*;
public class Consectiveones {
    static int ones(int arr[]) {
        int result = 0;
        int current = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                current = 0;
            } else {
                current++;
                result = Math.max(result, current);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]= {1,0,0,1,1,1,1,0,1,0,1,1,1};
        System.out.println(ones(arr));
    }
}
