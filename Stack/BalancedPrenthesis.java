package stackk;
import java.util.*;
public class BalancedPrenthesis {
	private static boolean isvalid(String s) {
		Deque<Character>d=new ArrayDeque<>();
		for(char a:s.toCharArray())
		{
			if(a=='(')
			{
				d.push(')');
			}
			else if(a=='{')
			{
				d.push('}');
			}
			else if (a=='['){
				d.push(']');
			}
			else if(d.isEmpty()||d.pop()!=a) {
				return false;
			}
				
				
		}return d.isEmpty();
		
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	Deque<Character> d=new ArrayDeque<Character>();
	for (char c : s.toCharArray()) {
		if(c=='['||c==']'||c=='{'||c=='}'||c=='('||c==')')
	{
			     if(c=='(')
			{
				d.push(')');
			}
			else if(c=='{')
			{
				d.push('}');
			}
			else if(c=='[')
			{
				d.push(']');
			}
			else if(d.isEmpty()|| d.peek()!=c) {
				System.out.println(false);
				return;
			}
	}
		}
	System.out.println(true);
}
}

