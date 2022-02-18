package binarySearchTree;

import java.util.*;
class BSTIterator {
    static List<TreeNode> list = new ArrayList<>();
    static int count = 0;

    public BSTIterator(TreeNode root) {
        helper(root);
    }
    
    private void helper(TreeNode root) {
        if (root == null) return;
        
        helper(root.left);
        list.add(root);
        helper(root.right);
    }
    
    public int next() {
        int result = list.get(count).val;
        count++;
        return result;
    }
    
    public boolean hasNext() {
        return count < list.size();
    }
}
// OPTIMAL APPROACH O(N)+(H) WE CAN USE ITERATIVE INORDER TRAVERSAL TO STORE ELEMENTS
//HASNEXT O(1) AVERAGE
//NEXT O(1) AVERAGE
class BSTITERATOR{
	private static Stack<TreeNode>stack=new Stack<>();
	 public BSTITERATOR(TreeNode root) {
		pushAll(root);
	}
	 public static boolean hasNext() {
		 
		 return !stack.isEmpty();
	 }
	 public static int next() throws Exception{
		 if(!hasNext()) throw new Exception("FULL");
		 TreeNode temp=stack.pop();
		 pushAll(temp.left);
		 return temp.val;
	 }
	 public static void pushAll(TreeNode node){
		 // ADD ALL  RIGHT SUCH THAT ADD ALL GREATER ELEMENT
		while(node!=null) {
			stack.push(node);
			node =node.right;
		}
		 }
	 
}
class BSTITERATORfORWARD{
	private static Stack<TreeNode>stack=new Stack<>();
	 public BSTITERATORfORWARD(TreeNode root) {
		pushAll(root);
	}
	 public static boolean hasNext() {
		 return !stack.isEmpty();
	 }
	 public static int next() throws Exception{
		 if(!hasNext()) throw new Exception("FULL");
		 TreeNode temp=stack.pop();
		 pushAll(temp.right);
		 return temp.val;
	 }
	 public static void pushAll(TreeNode node){
		while(node!=null) {
			stack.push(node);
			node =node.left;
		}
		 }
	 
}
public class BST_12_BSTiterator{
	public static void main(String[] args) throws Exception {
		 /*
	      8
      /   \    
    4      12
  /  \    /  \
 2    6  10   14
 
	  */

     TreeNode root = new TreeNode(8);
      root.left = new TreeNode(4);
      root.right = new TreeNode(12);
      root.left.left = new TreeNode(2);
      root.left.right = new TreeNode(6);
      root.right.left = new TreeNode(10);
      root.right.right = new TreeNode(14);
      BSTITERATOR bst=new BSTITERATOR(root);
      System.out.println(bst.next());
      System.out.println(bst.next());
      System.out.println(bst.next());
      System.out.println(bst.next());
      System.out.println(bst.next());

      


      
	}
}