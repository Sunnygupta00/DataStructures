package sORTING;

public class UNION_of_sorted_array {
 static void union(int a[],int b[])
 {
//	 if(a.length>b.length) { union(b,a);}
	 int i=0,j=0;
	 while(i<a.length&&j<b.length)
	 {
		 if(i>0&&a[i]==a[i-1])
		 {
			 i++;
			 continue;
		 }
		 if(j>0&&b[j]==b[j-1])
		 {
			 j++;
			 continue;
		 }
		 if(a[i]<b[j])
		 {
			 System.out.println(a[i]);
			 i++;
		 }
		 else if(b[j]<a[i])
		 {
			 System.out.println(b[j]);
			 j++;
		 }
		 else
		 {
			 System.out.println(a[i]);
			 i++;j++;
		 }
	 }
	 while(i<a.length)
	 {
		 if(i>0&&a[i]!=a[i-1])
		 {
		 System.out.println(a[i]);
		 }i++;
	 }
	 while(j<b.length)
	 {
		 if(j>0&&b[j]!=b[j-1]) {
		 System.out.println(b[j]);
		 
		 }
		 j++;
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,20,40,60};
		int b[]= {2,20,20,20,40};
   union(a,b);
	}

}
