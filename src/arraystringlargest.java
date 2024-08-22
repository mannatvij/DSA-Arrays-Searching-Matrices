public class arraystringlargest {
    public static void main(String[] args){
        String[]names= new String[10];
        names[0]="Madhu Vij";
        names[1]="Jatin Puri";
        names[3]="Aarti Mehta";
        names[4]="Mannat Vij";
        names[6]="Sri Sri Ravi Shankar";
        names[5]="Aarushi Vij";
        String largest=names[0];
        for(int i=0; i<names.length; i++) {
            if (names[i] != null && names[i].compareTo(largest) > 0) {
                largest = names[i];
            }
        }
            System.out.println("The largest name is " + largest);

    }

}
