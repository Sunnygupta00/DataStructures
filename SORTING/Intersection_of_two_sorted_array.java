package sORTING;

public class Intersection_of_two_sorted_array {

	static void intersection(int a[],int b[])
	{
		int i=0,j=0;
		while(i<=a.length&&j<b.length)
		{
			if(i>0&& a[i]==a[i-1])
			{
				i++;
				continue;
			}
			if(j>0&& b[j]==a[j-1])
			{
				j++;
				continue;
			}
			if(a[i]==b[j])
			{
				System.out.println(a[i]);
				i++;j++;
			}
			else if(a[i]>a[j])
			{
			j++;	
			}
			else
			{
				i++;
			}
		}
	}
	
	public static void main(String[] args) {
		int a[]= {10,20,20,40,60};
		int b[]= {2,20,20,20};
		intersection(a,b);

	}

}
