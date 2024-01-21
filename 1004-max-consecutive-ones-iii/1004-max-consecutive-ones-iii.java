class Solution {
    public int longestOnes(int[] nums, int k) {
        int flip=0;
        int ans=0;
        int high=0,low=0;
        while(high<nums.length){
            if(nums[high]==0){
                flip++;
            }
            while(flip>k){
                if(nums[low]==0){
                    flip--;
                }
                low++;
            }
            ans=Math.max(ans,high-low+1);
            high++;
        }
        return ans;
    }
}