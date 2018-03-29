/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return firstBadVersion(1, n, 1+(n-1)/2);
    }
   
    private int firstBadVersion(int low, int high, int mid){
        if(low < high){
            if(isBadVersion(mid);){
                return firstBadVersion(low, mid, (low + (mid - low)/2));
            } else{
                return firstBadVersion(mid+1, high, (mid+1 + (high - mid+1)/2));
            }
        }else{
            return low;
        }
    }
}