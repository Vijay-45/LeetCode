

//Time Complexity - O(n)
//Auxilary Space - O(n)



class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String res=s+s;
      // If there is a repetion then the string will be present in the temp string 
        String temp=res.substring(1,res.length()-1);
        if(temp.indexOf(s)!=-1){
            return true;
        }
        return false;
    }
}
