import java.util.*;
public class Summaryranges {
        public List<String> summaryRanges(int[] nums) {
            List<String> result= new ArrayList<>();
            int n= nums.length;
            if (n == 0) {
                return result;  // Return empty list if input is empty
            }
            int start = nums[0];

            for(int i=1; i<=n;i++){
                if(i== n|| nums[i]!= nums[i-1]+1){ // here we check that the next element is just one greater than previous or not, if yes then put in range, else if last or not put value of start index.
                    if(start==nums[i-1]){
                        result.add(String.valueOf(start));
                    }

                    else {
                        result.add(start +"->" +nums[i-1]); // assigning range.
                    }
                    if (i<n){
                        start= nums[i];
                    }
                }
            }
            return result;
        }
        public static void main(String[] args) {
            int nums[]= {0,1,2,4,5,7};
            Summaryranges sr= new Summaryranges();
            System.out.println(sr.summaryRanges(nums));
        }
    }


