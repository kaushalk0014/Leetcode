class Solution {
    public int[] singleNumber(int[] nums) {
        int a=0, b =0, xor=0;

        for(int i=0;i<nums.length; i++){
            xor =xor^ nums[i];
        }

        int lastSetBit= xor & ~ (xor-1);

        for( int i =0; i < nums.length; i++){
            if((nums[i] & lastSetBit) != 0){
                a= a^ nums[i];
            } else{
                b = b^ nums[i];
            }
        }

        return new int[]{a,b};
    }
}