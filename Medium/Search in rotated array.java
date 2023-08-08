

//Time Complexity - O(logn)
//Auxilary Space - O(1)


class Solution {
    public int search(int[] arr, int key) {
        int n=arr.length;
        int l=0,h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==key) return mid;
            else if(arr[l]<=arr[mid]){
                if(arr[mid]>=key && arr[l]<=key){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(arr[mid]<=key && arr[h]>=key){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
        }
        return -1;
    }
}
