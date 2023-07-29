

//Time Complexity - O(logn)
//Auxilary Space - O(1)




class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {FirstOccurence(nums,target),LastOccurence(nums,target)};
    }
    int FirstOccurence(int[] arr,int key){
        int n=arr.length;
        int l=0,h=n-1;
        int ans=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==key){
                ans=mid;
                h=mid-1;
            }
            else if(arr[mid]<key){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return ans;
    }
    int LastOccurence(int[] arr,int key){
        int n=arr.length;
        int l=0,h=n-1;
        int ans=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==key){
                ans=mid;
                l=mid+1;
            }
            else if(arr[mid]<key){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return ans;
    }
}
