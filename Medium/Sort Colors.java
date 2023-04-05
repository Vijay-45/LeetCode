

//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int l=0,h=n-1;
        int mid=0;
        int temp=0;
        while(mid<=h){
            switch(nums[mid]){
                case 0:
                    temp=nums[mid];
                    nums[mid]=nums[l];
                    nums[l]=temp;
                    mid++;l++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp=nums[h];
                    nums[h]=nums[mid];
                    nums[mid]=temp;
                    h--;
                    break;
            }
        }
    }
}
