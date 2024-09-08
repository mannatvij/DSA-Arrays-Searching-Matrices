public class Maxlengthevenoddsubarray {
    static int evenodd(int arr[]){
        int curr=1;
        int result=1;
        for(int i=1;i<arr.length;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)) {
                curr++;
                result= Math.max(result,curr);
            }
            else
                curr=1;
        }
        return result;
    }
    public static void main(String args[]){
        int arr[]= {10,13,14,15,17,12};
        System.out.println(evenodd(arr));
    }
}
