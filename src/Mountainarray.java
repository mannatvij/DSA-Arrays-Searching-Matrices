public class Mountainarray {
    boolean mountainarray(int arr[]){
        if(arr.length< 3)
            return false;

        int i=0;

        while(i+1< arr.length && arr[i] < arr[i+1]){ // ascend.
                i++;
            }
        if(i==1 || i==arr.length-1){ // peak cant be first or last
            return false;
        }
         while (i+1< arr.length && arr[i] > arr[i+1]){ // decent
             i++;
             }
         return i == arr.length-1; // return last index to check if we reached end of array.
    }
    public static void main(String args[]){
        Mountainarray mountainarray = new Mountainarray();
        System.out.println(mountainarray.mountainarray(new int[]{1,2,3,4,5,2}));
    }
}
