

//Time Complexity - O(nlogn)
//Auxilary Space - O(n)


class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1;
        MergeSort(nums,l,r);
        return nums;
    }
    static void MergeSort(int[] nums,int l,int r){
        if(l<r){
            int mid=l+(r-l)/2;
            MergeSort(nums,l,mid);
            MergeSort(nums,mid+1,r);
            MergeFun(nums,l,mid,r);
        }
    }
    static void MergeFun(int[] arr,int l,int m,int r){
        int n1=m-l+1,n2=r-m;
        int[] left=new int[n1];
        int[] right=new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[i+l];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[m+1+i];
        }

        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }
}
