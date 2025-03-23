class Solution {
    public int romanToInt(String str) {
        Map<Character, Integer> map=new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result=0;
        int prevValue=0;

        for(int i= str.length()-1;  i>=0; i--){
            int currectValue= map.get(str.charAt(i));

            if(currectValue < prevValue){
                result= result- currectValue;
            }else{
                result = result+ currectValue;
            }
            prevValue=currectValue;
        }
        return result;
    }
}