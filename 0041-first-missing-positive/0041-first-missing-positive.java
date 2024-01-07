class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int val=0;
        int nextValue=0;
        for(int i=0;i<n;i++){
            if(nums[i]<=0||nums[i]>n){
                continue;
            }
            val=nums[i];
            while(val!=nums[val-1]){
                nextValue=nums[val-1];
                nums[val-1]=val;
                val=nextValue;
                if(val<=0||val>n){
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }
}