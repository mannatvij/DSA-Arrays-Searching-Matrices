import java.util.*;
public class arraylistfindelement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer>al = new ArrayList<>();
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        for (int i=0; i<n; i++ ){
            int als= sc.nextInt();
            al.add(als);
        }
            System.out.println("The array is:" +al);
        System.out.println("Enter the element to find");
        int element= sc.nextInt();

        for(int i=0; i<n; i++){
            if(al.get(i) == element) System.out.println("The element is in the array");
            else {
                System.out.println("The element is not in the array");
            }
        }
    }
}
