import java.util.Arrays;

public class LC462minmovestoequalarraytwo {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int ans=0;
        while(i<j){
            ans= ans+ (nums[j]-nums[i]); //do this question again, rpobably median nikalne se, add kari jao!
            i++;
            j--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println( new LC462minmovestoequalarraytwo().minMoves2(arr));
    }
}
