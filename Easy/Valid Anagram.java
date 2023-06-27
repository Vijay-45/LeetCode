

//Time Complexity - O(n)
//Auxilary Space - o(1)



class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int n=s.length();
        int[] arr=new int[256];
        for(int i=0;i<n;i++){
            arr[s.charAt(i)]++;
            arr[t.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}
