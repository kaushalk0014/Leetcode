class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>  ans=new ArrayList<String>();
        generateP(ans,n,0,0,"");
        return ans;
    }
    
    private void generateP(List<String> ans,int n,int open,int close,String ans_str){
        if(ans_str.length()==n*2)   {
            ans.add(ans_str);
            return;
        }
        if(open<n){
            generateP(ans,n,open+1,close,ans_str+"(");
        }
         if(close<open){
            generateP(ans,n,open,close+1,ans_str+")");
        }
    }
}