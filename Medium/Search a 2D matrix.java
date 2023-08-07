

//Time Complexity - O(r+c)
//Auxilary Space - O(1)





class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int r=arr.length;
        int c=arr[0].length;
        int top=0,left=c-1;
        while(top<r && left>=0){
            if(arr[top][left]==target){
                return true;
            }
            else if(arr[top][left]<target){
                top++;
            }
            else{
                left--;
            }
        }
        return false;
    }
}
