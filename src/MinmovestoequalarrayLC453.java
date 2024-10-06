public class MinmovestoequalarrayLC453 {
    // for all elements equal the sum of all elements should be equal to (min element * number of elemeents)
    public int minMoves(int[] nums) {
        int min = nums[0], sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            sum += nums[i];
        }
        return sum - min * nums.length;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(new MinmovestoequalarrayLC453().minMoves(arr));
    }
}
