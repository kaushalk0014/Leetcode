class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null || t==null || s.length()!=t.length()){
            return false;
        }
        Map<Character, Integer> map=new HashMap<>();
        for(char ch: s.toCharArray()){
           map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch: t.toCharArray()){
            if(map.containsKey(ch)){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch, map.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        if(map.size()>0){
            return false;
        }
        return true;
    }
}