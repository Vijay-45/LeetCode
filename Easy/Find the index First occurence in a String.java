

//Time Complexity - o((n-m)*m)
//Auxilary Space - o(1)


public class Main
{
	public static void main(String[] args) {
		String s="safbutsaf";
		String s1="sad";
		System.out.println(Solve(s,s1));
	}
	static int Solve(String s,String s1){
	    int n=s.length();
	    int m=s1.length();
	    if(m>n){
	        return -1;
	    }
	    for(int i=0;i<=(n-m);i++){
	        int j=0;
	        while(j<m && s.charAt(i+j)==s1.charAt(j)){
	            j++;
	        }
	        if(j==m){
	            return 0;
	        }
	    }
	    return -1;
	    
	}
}

_____________________________________________________________________________________________________________________________________________________________________________


  //Time Complexity - o(n)  ---  indexOf() internally performs linear Search so it takes O(n)
  //Auxilary Space - O(1)




  class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
