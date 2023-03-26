


//Time Complexity - O(logn)
//Auxilary Space - O(1)




class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        while(h>=l){
            int mid=(l+h)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                h=mid-1;
            }
            else if(target>nums[mid]){
                l=mid+1;
            }
        }
        return -1;
    }
}
