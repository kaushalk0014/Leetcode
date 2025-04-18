class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans=0;       int sum=0;
        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
        map.put(0,1);
        for(int i=0;i < nums.length; i++){
            sum=sum+nums[i]; 
            if(map.containsKey(sum-k)){
                ans= ans+ map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum ,0)+1);
        }
        return ans;
    }
}