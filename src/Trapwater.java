import java.util.*;

import static java.lang.Integer.max;
import static java.lang.Math.min;

public class Trapwater {
    static int gettrapwater(int arr[]){
        int n = arr.length;
        int res=0;
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        lmax[0]= arr[0];
        for(int i=1; i<n;i++){
            lmax[i]= max(lmax[i-1], arr[i]);
        }
        rmax[0]= arr[n-1];
        for(int i=n-2; i>=0; i--){
            rmax[0]= max(rmax[i+1], arr[i]);
        }
        for(int i=0; i<n;i++){
            res= res+ (min(lmax[i],rmax[i]) -arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={5,0,6,2,3};
        Trapwater gettrapwater = new Trapwater();
        System.out.println(gettrapwater.gettrapwater(arr));
    }
}
