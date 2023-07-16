


//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution {
    public int maximumBeauty(int[] nums, int k) {
        int n=nums.length;
        int limit=100000;
        int[] arr=new int[300002];
        for(int i=0;i<n;i++){
            int start=nums[i]-k;
            int end=nums[i]+k;

            arr[start+limit]++;
            arr[end+limit+1]--;
        }
        int res=arr[0];
        for(int i=1;i<300002;i++){
            arr[i]+=arr[i-1];
            res=Math.max(res,arr[i]);
        }
        return res;
    }
}
