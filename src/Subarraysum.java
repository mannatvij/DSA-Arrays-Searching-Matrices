import java.util.*;
public class Subarraysum {
    static int subarraySum(int[] arr){
        int maxending= arr[0];
        int result= arr[0];
        for(int i=0;i<arr.length;i++){
            maxending= Math.max(maxending + arr[i],arr[i]);
            result= Math.max(result,maxending);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]= {-5,1,-2,3,-1,2,-2};
        System.out.println(subarraySum(arr));
    }
}
