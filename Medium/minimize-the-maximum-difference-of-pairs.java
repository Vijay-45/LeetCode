

//Time Complexity - O(n*log(maxDifference))
//Auxilary Space - O(1)



class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n=nums.length;
        int left=0;
        int right=nums[n-1]-nums[0];
        int ans=right;
        while(left<=right){
            int mid=(left+right)/2;
            if(isValid(nums,p,mid)){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    boolean isValid(int[] nums,int p,int diff){
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]<=diff){
                p--;
                i++;
            }
        }
        return p<=0;
    }
}
