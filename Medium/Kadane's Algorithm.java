

//Time Complexity - O(n)
//Auxilary Space - O(1)




class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int res=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
           sum=Math.max(nums[i],sum+nums[i]);
           res=Math.max(sum,res);
        }

        return res;
    }
}
