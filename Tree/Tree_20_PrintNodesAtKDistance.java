package tree;

public class Tree_20_PrintNodesAtKDistance {
static void printNodes(Node root,int k)
{
	if(root==null)return;
	if(k==0)
	{
		System.out.print(root.key+"->");
		k=2;
	}
	printNodes(root.Left, k-1);
	
	printNodes(root.Right,k-1);
}
	public static void main(String[] args) {
		/* Construct the following tree
        1
      /   \
     /     \
    2       3
          /   \
         /     \
        5       6
      /   \
     /     \
    7       8
          /   \
         /     \
        9      10
*/

Node root = new Node(1);
root.Left = new Node(2);
root.Right = new Node(3);
root.Right.Left = new Node(5);
root.Right.Right = new Node(6);
root.Right.Left.Left = new Node(7);
root.Right.Left.Right = new Node(8);
root.Right.Left.Right.Left = new Node(9);
root.Right.Left.Right.Right = new Node(10);
printNodes(root, 2);

	}

}
