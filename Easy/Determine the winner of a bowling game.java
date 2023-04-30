

//TIme Complexity - O(n)
//Auxilary Space - O(1)



class Solution {
    public int isWinner(int[] arr1, int[] arr2) {
        int sum=0,sum1=0;
        int n=arr1.length;
        for(int i=0;i<n;i++){
            if(i==1){
                if(arr1[i-1]==10){
                    sum+=2*(arr1[i]);
                }
                else{
                    sum+=arr1[i];
                }
            }
            else if(i>1){
                if((arr1[i-1]==10 || arr1[i-2]==10)){
                    sum+=2*(arr1[i]);
                }
                else{
                    sum+=arr1[i];
                }
            }
            else{
                sum+=arr1[i];
            }
        }
        for(int i=0;i<n;i++){
            if(i==1){
                if(arr2[i-1]==10){
                    sum1+=2*(arr2[i]);
                }
                else{
                    sum1+=arr2[i];
                }
            }
            else if(i>1){
                if((arr2[i-1]==10 || arr2[i-2]==10)){
                    sum1+=2*(arr2[i]);
                }
                else{
                    sum1+=arr2[i];
                }
            }
            else{
                sum1+=arr2[i];
            }

        }
        return (sum>sum1)? 1 :(sum<sum1) ? 2 : 0;
    }
}
