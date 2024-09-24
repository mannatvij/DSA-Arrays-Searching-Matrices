public class Squareroot {
    static int Squareroot(int n){
        int low=1;
        int high=n;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int square= mid*mid;
            if(square==n)
                return mid;
                else if( square > mid)
                    high=mid-1;
                else
                    low=mid+1;
                ans= mid;

        }
            return ans;
    }
    public static void main(String[] args) {
        System.out.println(Squareroot(5));
    }

}
