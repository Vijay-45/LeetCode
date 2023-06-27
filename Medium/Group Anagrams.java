

//Time Complexity - O(n^2)
//Auxilary Space - O(n)


class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        List<List<String>> list=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            List<String> l=new ArrayList<>();
            if(arr[i]!=null){
                l.add(arr[i]);
                for(int j=i+1;j<n;j++){
                    if(arr[j]!=null && isAnagram(arr[i],arr[j])){
                        l.add(arr[j]);
                        arr[j]=null;
                    }
                }
                list.add(l);
            }
        }
        return list;
    }
    public boolean isAnagram(String s,String s1){
        if(s.length()!=s1.length()){
            return false;
        }
        int n=s.length();
        int[] arr=new int[256];
        for(int i=0;i<n;i++){
            arr[s.charAt(i)]++;
            arr[s1.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}
