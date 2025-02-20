class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        for(int i=0; i< nums.length; i++){
            totalSum=totalSum+nums[i];
        }
        int leftSum=0;
        for(int i=0; i< nums.length; i++){
            if(leftSum== (totalSum-leftSum- nums[i])){
                return i;
            }
             leftSum=leftSum+nums[i];
        }
        return -1;

    }
}