

//Time Complexity - O(n)
//Auxilary Space - O(n)





class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb=new StringBuilder(arr[i]);
            sb.reverse();
            arr[i]=String.valueOf(sb);
        }
        sb=new StringBuilder(arr[0]);
        for(int i=1;i<arr.length;i++){
            sb.append(" ");
            sb.append(arr[i]);
        }
        sb.reverse();
        String res=sb.toString();
        return res.replaceAll("\\s+"," ").trim();
    }
}
