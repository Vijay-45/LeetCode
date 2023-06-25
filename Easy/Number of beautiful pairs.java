

//Time Complexity - O(n^2)
//Auxilary Space - O(1)



public class Main
{
	public static void main(String[] args) {
		int[] arr={31,25,72,79,74};
		System.out.println(Solve(arr));
	}
	static int Solve(int[] arr){
	    int n=arr.length;
	    int count=0;
	    for(int i=0;i<n-1;i++){
	        int temp1=arr[i]/(int)(Math.pow(10,digits(arr[i])-1));
	        for(int j=i+1;j<n;j++){
	            int temp2=arr[j]%10;
	            if(gcd(temp1,temp2)==1){
	                count++;
	            }
	        }
	    }
	    return count;
	}
	static int gcd(int a,int b){
	    a=Math.abs(a);
	    b=Math.abs(b);
	    while(b!=0){
	        int temp=b;
	        b=a%b;
	        a=temp;;
	    }
	    return a;
	}
	static int digits(int n){
	    int count=0;
	    while(n!=0){
	        n/=10;
	        count++;
	    }
	    return count;
	}
}
