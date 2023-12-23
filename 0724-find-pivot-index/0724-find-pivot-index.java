class Solution {
    public int pivotIndex(int[] nums) {
        int lsum=0,rsum=0;
        for(int i=0;i<nums.length;i++){
            rsum=rsum+nums[i];
        }
        for(int j=0;j<nums.length;j++){
            rsum=rsum-nums[j];
            if(rsum==lsum){
                return j;
            }
            lsum=lsum+nums[j];
        }
        return -1;
    }
}