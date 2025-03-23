class Solution {
    public int lengthOfLastWord(String s) {
        String arr[]= s.split(" ");
        String result =arr[arr.length-1];
        return result.length();
    }
}