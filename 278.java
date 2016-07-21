/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int end=n;
        int start=1;
        while(end>start){
            int mid = start + (end - start)/2;
            if (isBadVersion(mid)==true){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}
