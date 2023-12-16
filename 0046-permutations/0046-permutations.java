class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        dfs(nums,0);
        return ans;
    }
    private void dfs(int[] nums,int index){
            if(index==nums.length){
                ans.add(toList(nums));
                return;
            }
             for(int i=index;i<nums.length;i++){
                swap(i,index,nums);
                dfs(nums,index+1);
                swap(i,index,nums);
            }
        
    }
    private void swap(int x,int y, int []nums){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
    
    private List<Integer> toList(int[] nums){
        List<Integer> list=new ArrayList<>();
        for(int value:nums){
            list.add(value);
        }
        return list;
    }
}