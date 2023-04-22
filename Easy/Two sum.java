

//Time Complexity - O(n)
//Auxilary Space - O(n)


class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n=arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int tar=target-arr[i];
            if(map.containsKey(tar)){
                return new int[] {map.get(tar),i};
            }
            else{
                map.put(arr[i],i);
            }
        }
        return new int[] {-1,-1};
    }
}
