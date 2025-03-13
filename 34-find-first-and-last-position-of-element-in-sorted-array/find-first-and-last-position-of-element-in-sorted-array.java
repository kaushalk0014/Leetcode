class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int firtPosition=-1;
        int lastPosition=-1;
        while(low<=high){
            int mid =(low+high)/2;

            if(nums[mid] == target){
                firtPosition = mid;
                high= mid-1;
            }else if( target >nums[mid] ){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(nums[mid] ==target){
                lastPosition=mid;
                low=mid+1;
            }else if(nums[mid]< target){
                low=mid+1;
            }else{
                high= mid-1;
            }
        }

        return new int[]{firtPosition, lastPosition};
    }
}