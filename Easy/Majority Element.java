

//Time Complexity - O(n)
//Auxilary Space - O(1)


class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int res=0,count=1;
        for(int i=1;i<n;i++){
            if(nums[res]==nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                res=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<n;i++){
            if(nums[res]==nums[i]) count++;
        }
        if(count>(n/2)){
            return nums[res];
        }
        return -1;
    }
}
