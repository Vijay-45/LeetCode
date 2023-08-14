
//Time Complexity - O(n)
//Space Complexity - O(1)




class Solution {
    public int findKthLargest(int[] arr, int k) {
        int n=arr.length;
        int l=0,h=n-1;
        while(l<=h){
            int p=Partition(arr,l,h);
            if(p==n-k) return arr[p];
            else if(p<n-k){
                l=p+1;
            }
            else{
                h=p-1;
            }
        }
        return -1;
    }
    int Partition(int[] arr,int l,int h){
        int p=arr[h];
        int i=l-1;
        int temp=0;
        for(int j=l;j<h;j++){
            if(arr[j]<p){
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=arr[i+1];
        arr[i+1]=p;
        arr[h]=temp;
        return i+1;
    }
}
