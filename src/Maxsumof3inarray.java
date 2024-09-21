import java.util.Arrays;

public class Maxsumof3inarray {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==3)
            return nums[0]*nums[1]*nums[2];
        int result=1;
        result= Math.max(nums[nums.length-1]* nums[nums.length-2]* nums[nums.length-3] , nums[0]*nums[1]*nums[nums.length-1]);
        return result;
    }
    public static void main(String[] args) {
        int arr[]={-100,-40,2,4,8};
        System.out.println(new Maxsumof3inarray().maximumProduct(arr));
    }
}
