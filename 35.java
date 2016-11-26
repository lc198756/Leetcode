public class Solution {
    public int searchInsert(int[] A, int target) {
        if(A == null||A.length == 0)
            return 0;
        int low = 0, high = A.length-1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(A[mid] > target)
                high = mid - 1;
            else if(A[mid] < target)
                low = mid + 1;
            else
                return mid;
        }

        return low;
    }
}
