

//Time Complexity - O(n)
//Auxilary Space - o(n)


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        ArrayList<Integer> list =new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int x:nums2){
            set.add(x);
        }
        for(int i=0;i<n;i++){
            if(set.contains(nums1[i])){
                list.add(nums1[i]);
                set.remove(nums1[i]);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
