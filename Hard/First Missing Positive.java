

//Time Complexity - o(n)
//Auxilary Space - o(1)



class Solution {
    public int firstMissingPositive(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>0 && arr[i]<=n){
                int ch=arr[i]-1;
                if(arr[ch]!=arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[ch];
                    arr[ch]=temp;
                    i--;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }
}
