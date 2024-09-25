import java.util.Arrays;

public class Firatandlastinsortedarray {
    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0)
            return new int[] {-1, -1};

        int leftmost = -1;
        int rightmost = -1;

        // Leftmost (first occurrence)
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                if (mid == 0 || nums[mid - 1] != target) {
                    leftmost = mid;
                    break;
                } else {
                    end = mid - 1;
                }
            }
        }

        // If leftmost is not found, no need to continue
        if (leftmost == -1) {
            return new int[] {-1, -1};
        }

        // Rightmost (last occurrence)
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                if (mid == nums.length - 1 || nums[mid + 1] != target) {
                    rightmost = mid;
                    break;
                } else {
                    start = mid + 1;
                }
            }
        }

        return new int[] {leftmost, rightmost};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{10, 20, 30, 30, 40}, 30)));
    }
}
