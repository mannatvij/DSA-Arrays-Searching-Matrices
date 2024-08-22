public class arraymin {
    public static void main(String[] args) {

        int[]marks= {12,9,7,4,10,6};
        int i;
        int min= marks[0];
        for(i=0; i<6; i++){
        if(marks[i] < min){
         min = marks[i];
     }
        }
        System.out.println("The minimum element is : " +min);
    }
}
