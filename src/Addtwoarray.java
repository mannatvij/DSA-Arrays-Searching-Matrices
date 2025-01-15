import java.util.Arrays;

public class Addtwoarray {
    public int[] addTwoArrays(int[] nums1, int[] nums2) {
        int minLength = Math.min(nums1.length, nums2.length);
        int[] sum = new int[minLength];

        for (int i = 0; i < nums1.length; i++) {
            sum[i] = nums1[i] + nums2[i];

        }
        return sum;

    }
    public static void main(String[] args) {
        Addtwoarray addtwoarray = new Addtwoarray();
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {4, 5, 1, 2};
        System.out.println(Arrays.toString(addtwoarray.addTwoArrays(nums1, nums2)));
    }
}
