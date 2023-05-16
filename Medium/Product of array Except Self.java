

//Time complexity - O(n)
//Auxilary Space - O(n)




class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n=arr.length;
        int[] temp=new int[n];
        int[] left=new int[n];
        int[] right=new int[n];
        int curr=1;
        for(int i=0;i<n;i++){
            left[i]=curr;
            curr*=arr[i];
        }
        curr=1;
        for(int i=n-1;i>=0;i--){
            right[i]=curr;
            curr*=arr[i];
        }
        for(int i=0;i<n;i++){
            temp[i]=left[i]*right[i];
        }
        return temp;
    }
}
