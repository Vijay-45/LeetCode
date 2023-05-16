

//Time Compleixity - O(n)
//Auxilary Space - O(1)



class Solution {
    public int maxProduct(int[] arr) {
        int n=arr.length;
        int pre=1,suff=1;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            pre*=arr[i];
            suff*=arr[n-i-1];
            res=Math.max(res,Math.max(pre,suff));

            if(pre==0) pre=1;
            if(suff==0) suff=1;
        }
        return res;
    }
}
