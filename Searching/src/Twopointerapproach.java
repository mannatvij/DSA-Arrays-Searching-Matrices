import java.util.Arrays;

public class Twopointerapproach {
    public int[] twosum(int[] nums, int target){
        int i =0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]+ nums[j]== target)
                return new int [] {i,j};
            else if (nums[i]+nums[j]>target)
                j--;
            else
                i++;
        }
        return new int [] {i,j};
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int target=30;
        Twopointerapproach obj=new Twopointerapproach();
        System.out.println(Arrays.toString(obj.twosum(arr, target)));
    }
}
