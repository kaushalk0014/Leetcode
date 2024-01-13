class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int high=0;
        int low=0;
        int ans=0;
        int n=weights.length;
        for(int i=0;i<n;i++){
            if(weights[i]>low){
                low=weights[i];
            }
            high=high+weights[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(funCal(mid,weights,n,days)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
   
    boolean funCal(int mid,int[] weights,int n, int days){
        int sum=0,day=1;
        for(int i=0;i<n;i++){
            if(sum+weights[i]<=mid){
                sum+=weights[i];
            }else{
                sum=weights[i];
                day++;
            }
        }
        if(day<=days){
            return true;
        }else{
            return false;
        }
    }
}