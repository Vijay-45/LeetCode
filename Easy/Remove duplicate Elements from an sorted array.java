

//Time Complexity - O(n)
//Auxilary Space - O(1)




class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int l=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[l]=nums[i];
                l++;
            }
        }
        return l;
    }
}
