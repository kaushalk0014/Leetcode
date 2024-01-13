class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=(int)1e9;
        while(low<high){
            int mid=(low+high)/2;
            if(finCal(mid,piles,h)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
        
    }
    boolean finCal(int k,int[] piles, int h){
        int hours_req=0;
        for(int i=0;i<piles.length;i++){
            hours_req+=Math.ceil((piles[i]*1.0)/k);
        }
        if(hours_req<=h){
            return true;
        }else{
            return false;
        }
    }
}