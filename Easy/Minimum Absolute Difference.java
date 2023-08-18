


//Time Complexity - O(nlogn)
//Auxilary Space - O(n)





class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        int val=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            int diff=(int)Math.abs(arr[i]-arr[i-1]);
            if(diff<val){
                res.clear();
                List<Integer> list=Arrays.asList(arr[i-1],arr[i]);
                res.add(list);
                val=diff;
            }
            else if(diff==val){
                List<Integer> list=Arrays.asList(arr[i-1],arr[i]);
                res.add(list);
            }
        }
        return res;
    }
}
