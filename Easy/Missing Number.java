

//Time Complexity - O(n)
//Auxilary Space - O(1)


class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int ele = nums[i];

            if(nums[i]>0){
                int ch = ele-1;
                if(nums[ch]!=nums[i]){
                    int temp=nums[i];
                    nums[i]=nums[ch];
                    nums[ch]=temp;
                    i--;
                }
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return 0;
    }
}
