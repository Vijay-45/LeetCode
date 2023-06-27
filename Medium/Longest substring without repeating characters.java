
//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int res=0,i=0,maxEnd=0;
        int[] arr=new int[256];
        Arrays.fill(arr,-1);
        for(int j=0;j<n;j++){
            i=Math.max(i,arr[s.charAt(j)]+1);
            maxEnd=j-i+1;
            res=Math.max(res,maxEnd);
            arr[s.charAt(j)]=j;
        }
        return res;
        
    }
}
