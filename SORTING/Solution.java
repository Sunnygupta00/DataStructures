package sORTING;
class Solution {
    public static int mySqrt(int x) {
       int low=1;int high=x;int ans=0;
       if(x==0)return 0;
       if(x==1)return 1;
       while(low<=high)
       {
    	   int mid=low+(high-low)/2;
    	  
    	   if(mid<=x/mid)
    	   {
    		   ans=mid;
    		   low=mid+1;
    	   }
    	   else
    	   {
    		   high=mid-1;
    	   }
     }
        return ans;
    }
    public static void main(String[] args) {
		System.out.println(mySqrt(2147395599));
	}
}
/*
 * class Solution {
    public static int mySqrt(int x) {
        int low=1,high=x/2,ans=1;   
        if(x==0)
            return 0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid<=x/mid){
                ans=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return ans;
    }
   
    
}
 */
