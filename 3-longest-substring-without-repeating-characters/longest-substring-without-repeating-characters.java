class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map= new HashMap<Character, Integer>();
        int end =0;
        int result =0;

        for(int i=0; i< s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                end = Math.max(end, map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i), i);
            result=Math.max(result, i-end+1);
        }
        return result;
    }
}