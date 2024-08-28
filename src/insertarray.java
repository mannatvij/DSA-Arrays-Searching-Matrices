import java.util.*;
public class insertarray {

     static int insert(int arr[], int pos, int indx, int x, int cap, int n) {
         if (n == cap)
             return indx;
         indx = pos - 1;
         for (int i = n - 1; i >= indx; i--) {
             arr[i + 1] = arr[i];
         }
         arr[indx] = x;
         return (n + 1);
     }
        public static void main (String[]args){
            int arr[] = new int[5];
            arr[0] = 1;
            arr[1] = 22;
            arr[2] = 33;
            int x = 4;
            int indx = 2;
            int pos= 3;
            int n =3;
            int cap =5;
            n = insert(arr, pos, indx, x, cap, n);
            System.out.println("After Insertion");

            for(int i=0; i < n; i++)
            {
                System.out.print(arr[i]+" ");
            }


        }

    }


