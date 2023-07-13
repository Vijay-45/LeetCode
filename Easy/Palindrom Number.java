

//Time Complexity - o(n)
//Auxilary Space - O(1)


class Solution {
    public boolean isPalindrome(int x) {
        String s=x+"";
        int n=s.length();
        int st=0,en=n-1;
        while(st<en){
            if(s.charAt(st)!=s.charAt(en)){
                return false;
            }
            st++;en--;
        }
        return true;
    }
}
