


//Time Complexity - O(n)
//Auxilary Space - O(n)



class Solution {
    public List<List<Integer>> groupThePeople(int[] arr) {
        List<List<Integer>> res=new ArrayList<>();
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int req=arr[i];
          //Storing the index based on their values into hash as lists 
            if(!map.containsKey(arr[i])){
                map.put(arr[i],new ArrayList<>());
            }
            map.get(arr[i]).add(i);
//If the size of the list reaches the size of the key then we add that list into the res and remove the list
            if(map.get(arr[i]).size()==req){
                res.add(new ArrayList<>(map.get(arr[i])));
                map.get(arr[i]).clear();
            }
        }
        return res;
    }
}
