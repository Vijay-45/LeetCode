

//Time Complexity - O(n)
//Auxilary Space - O(n)




class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Deque<Character> stack=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            char x=s.charAt(i);
            if(x=='(' || x=='{' || x=='['){
                stack.push(x);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else if(isMapping(stack.peek(),x)==false){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        return (stack.isEmpty());
    }
    boolean isMapping(char a,char b){
        return (a=='(' && b==')' || a=='{' && b=='}' || a=='[' && b==']');
    }
}
