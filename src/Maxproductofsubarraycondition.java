//1464. Maximum Product of Two Elements in an Array
//Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
public class Maxproductofsubarraycondition {
    static int productmax(int arr[]){
        int res=0;
        int curr=0;
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                curr= ((arr[i]-1)* (arr[j]-1));
                res= Math.max(res,curr);
            }
        }
        return res;
    }
    public static void main(String args[]){
        int arr[]= {10,4,5,7};
        System.out.println(productmax(arr));
    }
}
