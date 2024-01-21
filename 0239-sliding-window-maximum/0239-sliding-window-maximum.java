class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int result[]=new int[n-k+1];
        int index=0;
        Deque<Integer> deque=new LinkedList<>();
        for(int i=0;i<n;i++){
            
            while(!deque.isEmpty()&&deque.peek()<i-k+1){
                deque.poll();
            }
            
             while(!deque.isEmpty()&&nums[deque.peekLast()]<nums[i]){
                 deque.pollLast();
             }
            //add element index to deque
            deque.offer(i);
            
            //add maximun element to result arrau
            if(i>=k-1){
                result[index]=nums[deque.peek()];
                index++;
            }
        }
        return result;
    }
}