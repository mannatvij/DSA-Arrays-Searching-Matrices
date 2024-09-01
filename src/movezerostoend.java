public class movezerostoend {
    static void movezeros(int arr[]){
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= {10,20,0,4,0,8,0};
        int n=arr.length;
        movezerostoend ob= new movezerostoend();
        movezeros(arr);
        System.out.println("New array:");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
