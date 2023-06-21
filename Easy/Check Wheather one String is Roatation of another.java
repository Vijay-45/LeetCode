

//Time Complexity - O(1)
//Auxilary Space - O(1)



class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        s=s+s;
        int found=s.indexOf(goal);
        return (found>=0);
    }
}
