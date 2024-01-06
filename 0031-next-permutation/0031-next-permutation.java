class Solution {
    
    private void swap(int[] nums, int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    private void reverse(int[] nums, int start, int end){
        while(start<end){
            swap(nums,start,end);
            start++;end--;
        }
    }
    public void nextPermutation(int[] nums) {
      int index=-1;
        int n=nums.length;
        for(int i=n-2; i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(nums,0,n-1);
        }else{
            for(int j=n-1;j>index;j--){
                if(nums[j]>nums[index]){
                    swap(nums,index,j);
                    break;
                }
            }
            reverse(nums,index+1,n-1);
        }
    } 
    
}