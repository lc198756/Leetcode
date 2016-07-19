/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if(n == 1) return n;
        int l = 1, r = n;
        int mid = n/2;
        while( l < r) {
            int check = guess((int)mid);
            if(check == 0) return mid;
            if(check == 1) {
                l = mid+1;
            } else {
                r = mid-1;
            }
            mid = l + (r-l)/2;
        }
        return l;
    }
}
