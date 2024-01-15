class Solution {
    public int[] singleNumber(int[] nums) {
        
     int x=0,y=0,xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        int setbit=xor & ~(xor-1);
        for(int j=0;j<nums.length;j++){
            if((nums[j]  & setbit)!=0){
                x=x^nums[j];
            }else{
              y=y^nums[j];
            }
        }
        return new int[]{x,y};
    }
}