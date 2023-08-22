


//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution {
    public int titleToNumber(String s) {
        int temp=0,res=0;
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            res+=((s.charAt(i)-'A')+1)*Math.pow(26,temp++);
        }
        return res;
    }
}
