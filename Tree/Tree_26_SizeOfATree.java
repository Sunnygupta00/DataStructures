package tree;
// WE HAVE TO COUNT TOTAL NUMBER OF NODES IN A TREE
public class Tree_26_SizeOfATree {
	private static int k=0;
	//	BRUTE FORCE TIME: O(N) + O(LOG N) OR O(HIGHT)
	static int sizeoftree(Node root)
	{
		if(root==null)return 0;
		k++;
		sizeoftree(root.Left);
		sizeoftree(root.Right);
		return k;
	}
//==============================================================================================================	
	
	//NOTE : THIS WILL ONLY WORK IN COMPLETE BINAY TREE
	// THE BASIC IDEA IS TO CALCULATE LEFT TREE HIGHT AND RIGHT TREE HIGHT IF THEY ARE EQUAL SIMPLY RETURN 2 POW(LEFT)-1
	// ELSE  GO TO SUB TREE OF LEFT AND RIGHT +1 ::: WHY +1 BECUSE WE ARE INCLUDING ROOT :)
	// OPTIMISED TIME: O((LOG N))^2 + O(HIGHT) ???? WHY (LOGN)^2 WE ARE CALCULATING HIGHT OF LEFT AND RIGHT SO LOGN *LOGN
	static int countNodes(Node root)
	{
		if(root==null)return 0;
		int left=leftHight(root);
		int right=rightHight(root);
		if(left==right)return (2<<left)-1;
		return countNodes(root.Left)+countNodes(root.Right)+1;
	}
	static int leftHight(Node root)
	{
		int count=0;
		while(root.Left!=null)
		{
			count++;
			root=root.Left;
		}
		return count;
	}
	static int rightHight(Node root)
	{
		if(root==null)return 0;
		int count=0;
		while(root.Right!=null)
		{
			count++;
			root=root.Right;
		}
		return count;
	}
	
	public static void main(String[] args) {
		/*
        1
      /   \
    2       3
  /   \    /  \
 4     5  7     8
        \     /  \
         6   9    10   

 */

Node root = new Node(1);
root.Left = new Node(2);
root.Right = new Node(3);
root.Left.Left = new Node(4);
root.Left.Right = new Node(5);
root.Right.Right = new Node(8);
root.Right.Left = new Node(7);
root.Left.Right.Right = new Node(6);
root.Right.Right.Left = new Node(9);
root.Right.Right.Right = new Node(10);
System.out.println(countNodes(root));
System.out.println(sizeoftree(root));
	}

}
