public class Pivotindex {
    static int Pivotindex(int nums[]){
        int n= nums.length;
        int leftsum[]= new int[n]; // make two arrays
        int rightsum[]= new int[n];
         leftsum[0]= nums[0];
         rightsum[n-1]= nums[n-1];
         for(int i=1; i<n;i++) {
             leftsum[i] = nums[i] + leftsum[i - 1];
         }
        for(int i = n-2; i >= 0; i--) {
            rightsum[i] = nums[i] + rightsum[i + 1];
        }
         for(int i=0; i<n;i++){
             if(leftsum[i]==rightsum[i]){
                 return i;
             }
         }
         return -1;
    }
    public static void main(String args[]){
        int nums[]={1,7,3,6,5,6};
        System.out.println(Pivotindex(nums));
    }

}
