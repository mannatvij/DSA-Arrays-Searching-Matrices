public class Peakvaluemountainproblem {
    public int findPeakElement(int[] nums) {
        int low=0;
        int high = nums.length-1;
        while(low<high){
            int mid=  low + (high - low)/2;
            if(nums[mid]> nums[mid+1]){
                high= mid; //here as we are in decreasing side, therefore mid = last, therefore we assign value.
            }
            else
                low= mid+1;
        }
        return low;
    }
    public static void main(String[] args) {
        Peakvaluemountainproblem p = new Peakvaluemountainproblem();
        System.out.println(p.findPeakElement(new int[]{1,2,3,1}));
    }
}
