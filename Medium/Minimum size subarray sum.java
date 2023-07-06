

//Time Complexity - o(n^2)
//Auxilary Space - o(1)



class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n=arr.length;
        int sum=0,res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum>=target){
                    res=Math.min(res,j-i+1);
                    break;
                }
            }
        }
        if(res==Integer.MAX_VALUE) return 0;
        return res;
    }
}


_____________________________________________________________________________________________________________________________________________________________________________




//Time Complexity - o(n)
//Auxilary Space - O(1)




class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n=arr.length;
        int sum=0,res=Integer.MAX_VALUE;
        int temp=0,st=0;
        for(int i=0;i<n;i++){
            if(sum<target){
                sum+=arr[i];
            }
            while(sum>=target){
                res=Math.min(res,i-st+1);
                sum-=arr[temp++];
                st++;
            }
        }
        if(res==Integer.MAX_VALUE){
            return 0;
        }
        return res;
    }
}
