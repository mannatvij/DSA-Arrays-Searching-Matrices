

import java.util.Arrays;
public class Sqauresofarray {
    public static int[] sortedSquares(int[] nums) {
        int[] sortedSquares= new int[nums.length]; // length of new array is same as previous one.
        for(int i=0; i< nums.length; i++){ // squares of new array
            sortedSquares[i]= nums[i]*nums[i];
        }
        Arrays.sort(sortedSquares); // sort the array.
        return sortedSquares;
    }
    public static void main(String[] args) {
     int arr[]={1,2, 5, 6};
     System.out.println(Arrays.toString(sortedSquares(arr)));

    }
}
