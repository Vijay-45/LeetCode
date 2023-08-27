

//Time Complexity - O(n)
//Auxilary Space - O(n)



class Solution {
    public long minimumPossibleSum(int n, int target) {
        int temp=0,i=1;
        Set<Integer> set=new HashSet<>();
        long res=0;
        while(temp<n){
          //If sum-i exists then we skip cause it will form sum to form the target
            if(!set.contains(target-i)){
                set.add(i);
                res+=i;
                temp++;
            }
            i++;
        }
        return res;

    }
}
