class Solution {
    public boolean isPerfectSquare(int num) {
        int low=1, high=num;
        int ans=0;
         if(num==0){
                return true;
            }
        while(low<=high){
            int mid=(low+high)/2;
           
            if(mid<=(num/mid)){
                ans=mid;
                low=mid+1;
            }else {
                high=mid-1;
            }
            if(ans*ans ==num){
            return true;
             }
        }
        return false;
    }
}