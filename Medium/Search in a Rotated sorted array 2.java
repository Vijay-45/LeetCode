

//Time Complexity - O(logn)
//Auxilary Space - O(1)



/*Its is almost same to the Search in a rotated sorted array the major difference is first one works for unique elements but for duplicate elements it wont work for example 
  [3,1,2,3,3,3,3] for this example it wont work cause it cannot find the sorted array as it finds  in case of unique elements.
  cause arr[l],arr[mid] and arr[h] all are same so it can't identify that's the main edge case it wont work.
  To solve that if they are all same then we just shrink the array but incresing l++ and decreasing h-- */



class Solution {
    public boolean search(int[] arr, int key) {
        int n=arr.length;
        int l=0,h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==key) return true;
            if(arr[mid]==arr[l] && arr[mid]==arr[h]){
                l++;h--;
                continue;
            }
            else if(arr[l]<=arr[mid]){
                if(arr[l]<=key && key<=arr[mid]){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(arr[mid]<=key && key<=arr[h]){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
        }
        return false;
    }
}
  
