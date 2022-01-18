package stackk;

public class K {
	static int power(int x,int n)
	{
		if(n==0)return 1;
		return x*power(x,n-1);
	}
	static long ans(int x,int n)
	{
		boolean flag=false;
//		if(n<0)
//		{
//			n=-n;
//			flag=true;
//		}
		long ans=fastpow(x, n);
//		if(flag==true)
//		{
//			ans=1/ans;
//			return ans;
//		}
		return ans;
				
		
	}
	public static void main(String[] args) {
		System.out.println(ans(2, -2));
		
		
	}

	static long fastpow(long x, long y) {
		if (y == 0)
			return 1;

		long p = fastpow(x, y / 2) ;
		p = (p * p);

		if (y % 2 == 0)
			return p;
		else
			return (x * p);
	}

}
