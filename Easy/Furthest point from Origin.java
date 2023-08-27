


//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution {
    public int furthestDistanceFromOrigin(String s) {
        int res=0,one=0,two=0,temp=0;
        int n=s.length();
      //By traversing count the no of R and L and underScores
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='R') one++;
            else if(s.charAt(i)=='L') two--;
            else{
                temp++;
            }
        }
        //By summing them we get In which direction we need to move if is less then zero it is left or it is right
        res=one+two;
        if(res>=0){
            return res+temp;
        }
      //if it is less then zero we move left so then we get the farthest point 
        return Math.abs(res-temp);
    }
}
