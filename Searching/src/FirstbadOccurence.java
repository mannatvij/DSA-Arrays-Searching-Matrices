public class FirstbadOccurence { //leetcode 278
    public int firstBadVersion(int n) {
        int start=1;
        int end =n;
        while(start<=end){
            int mid= end+(start-end)/2;
            if(isBadVersion(mid)){
                end= mid-1;
            }
            else{
                start= mid+1;
            }

        }
        return start; // start has to come, where the first bad is. when we get the first bad, we just shift to one back, to confirm it is for sure not bad.
    }
}
// is bad version is an api call. /* The isBadVersion API is defined in the parent class VersionControl.
//      boolean isBadVersion(int version); */