

//Time Complexity - O(2*n)
//Auxilary Space - O(n*2*n)



class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        Solve(nums,output,0,list);
        return list;
    }
    void Solve(int[] nums,List<Integer> output,int index,List<List<Integer>> res){
        if(index>=nums.length){
            res.add(new ArrayList<>(output));
            return;
        }

        //Exclude
        Solve(nums,output,index+1,res);

        //Include
        int ele=nums[index];
        output.add(ele);
        Solve(nums,output,index+1,res);
        output.remove(output.size()-1);
    }
}
