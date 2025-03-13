class Solution {
    public int mySqrt(int x) {

        if( x==0 || x ==1){
            return x;
        }
        int result=1;
        int low=0; int high =x;

        while(low<= high){
            int mid = (low + high )/2;

            if(mid <=  (x/mid)){
                result = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return result;
    }
}