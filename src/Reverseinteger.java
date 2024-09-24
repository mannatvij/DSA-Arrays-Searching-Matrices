public class Reverseinteger {
    public int reverse(int x) {
        int rev=0;
        int sign= 1; //we tricked here by putting sign valule as one, and if x is less than 0, then automatically sign =-1
        if(x<0){
            sign=-1;
            x= x*sign;
        }
        while(x>0){
            if (rev > (Integer.MAX_VALUE - x) / 10) {
                return 0; // Return 0 if overflow is detected
            }
            rev= rev*10 + x%10;
            x=x/10;

        }
        return (int) (rev*sign);
    }
    public static void main(String[] args) {
        Reverseinteger obj = new Reverseinteger();
        System.out.println(obj.reverse(-12));
    }
}
