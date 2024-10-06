import java.util.Arrays;

public class SortcolorsLC75 {
    public void swap(int [] arr, int i, int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public void sortColors(int[] nums) {
        int n= nums.length;
        int left=0;
        int mid=0;
        int right=n-1;
        while(mid<=right){
            if(nums[mid]==0){ //swap 0 towards the left
                swap(nums, left, mid);
                left++;
                mid++;
            }
            else if(nums[mid]==1){ //one in the middle.
                mid++;
            }
            else if(nums[mid]== 2){ //swap 2 towrds the right
                swap(nums, mid, right);
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,0,0,2,1,2,0,1};
        SortcolorsLC75 sort=new SortcolorsLC75();
        sort.sortColors(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
