public class maxdifference {
    public int maxdifference(int arr[]){
        int min = arr[0];
        int maxdiff= 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            else {
                int diff= arr[i]-min;
                if(diff>maxdiff){
                    maxdiff= diff;
                }
            }
        }
        return maxdiff;
    }
    public static void main(String args[]){
        int arr[]= {2,3,12,6,4,18,1};
        maxdifference obj = new maxdifference();
        System.out.println(obj.maxdifference(arr));
    }
}
