class Solution {
    public void moveZeroes(int[] nums) {
        int move =0;
        for(int i =0 ; i< nums.length; i++){
            if(nums[i] != 0){
                nums[move]= nums[i];
                move++;
            }
        }

        for(int i = move; i< nums.length; i++){
            nums[i]=0;
        }
    }
}