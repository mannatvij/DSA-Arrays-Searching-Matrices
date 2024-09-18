import java.util.Arrays;

public class Runningsumofarray1480LC {
    static int[] runningsum(int nums[]){
        int runningsum[]= new int[nums.length];
        runningsum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            runningsum[i]=runningsum[i-1]+nums[i];
        }
        return runningsum;
    }
    public static void main(String[] args) {
        int nums[]= {1,2,5,3,2,5};
        System.out.println(Arrays.toString(runningsum(nums)));
    }
}

