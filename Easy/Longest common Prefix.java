

//Time Complexity - O(n*m*logn)
//Auxillary Space - O(m)



class Solution {
    public String longestCommonPrefix(String[] arr) {
        int n=arr.length;
        int i=0,j=0;
        String res="";
        Arrays.sort(arr);
        while(i<arr[0].length() && j<arr[n-1].length()){
            if(arr[0].charAt(i)!=arr[n-1].charAt(j)){
                break;
            }
            res+=arr[0].charAt(i);
            i++;j++;
        }
        return res;
    }
}
