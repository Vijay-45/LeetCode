

//Time Complexity - O(n!)
//Auxialry Space - O(n)


class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Solve(nums,0,res);
        return res;
    }
    void Solve(int[] arr,int index,List<List<Integer>> res){
        if(index>=arr.length){
            List<Integer> list=new ArrayList<>();
            for(int x:arr){
                list.add(x);
            }
            res.add(list);
            return;
        }
        for(int i=index;i<arr.length;i++){
            Swap(i,index,arr);

            Solve(arr,index+1,res);

            Swap(i,index,arr);
        }
    }
    void Swap(int a,int b,int[] arr){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
