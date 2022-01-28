package sORTING;

public class Mergetwoarray{
	static void merge(int a[],int b[],int m[])
	{
		int i=0,j=0,k=0;
		while(i<a.length&&j<b.length)
		{
			if(a[i]<b[j])
			{
				m[k]=a[i];
				i++;k++;
			}
			else
			{
				m[k]=b[j];
				k++;j++;
			}
		}
		while(i<a.length)
		{
			m[k]=a[i];
			i++;k++;
		}
		while(j<b.length)
		{
			m[k]=b[j];
			k++;j++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,15,20};
		int b[]= {5,6,6,15};
		int m[]=new int [a.length+b.length];
		merge(a,b,m);
		for(int i:m)
		{
			System.out.print(i+" ");
		}

	}

}
