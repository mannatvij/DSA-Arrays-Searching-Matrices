public class Arraymax {

    public static void main(String[] args) {

        int[] marks = {10, 8, 19, 7, 13, 12};
        int i;
        int max= marks[0];
        for( i=0;i<6;i++){
            if (marks[i] > max){
                max= marks[i];

            }

        }
        System.out.println("The greatest number is " +max);
    }
}
