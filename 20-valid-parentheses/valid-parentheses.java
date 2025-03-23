class Solution {
    public boolean isValid(String str) {
        Stack<Character> stack=new Stack<Character>();

        for(char ch: str.toCharArray()){
            if(ch=='(' || ch =='{' || ch== '['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char open= stack.pop();
                if(!isMatch(open, ch)){
                    return false;
                }
            }
        }
         // Stack should be empty if valid parentheses
        return stack.isEmpty();
       
    }

    private boolean isMatch(char open, char close){
        return (open=='(' && close==')') || (open == '{' && close == '}')
                || (open == '[' && close == ']');
    }
}