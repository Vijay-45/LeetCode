

//Time Complexity  - O(n)
//Auxilary Space - O(1)



class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int x=0,temp=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                temp=nums[i];
                nums[i]=nums[x];
                nums[x]=temp;
                x++;
            }
        }
    }
}
