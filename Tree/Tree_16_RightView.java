package tree;

import java.util.ArrayList;
import java.util.List;

public class Tree_16_RightView {
	public static  List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        rightView(root, result, 0);
        return result;
    }
    // simple logic while traversing if list is empty add the node (right direction)
    public static  void rightView(TreeNode curr, List<Integer> result, int currDepth){
        if(curr == null){
            return;
        }
        // if curr level is equal to the size then only add root
        if(currDepth == result.size()){
            result.add(curr.val);
        }
        // go to right
        rightView(curr.right, result, currDepth + 1);
        // go to left
        rightView(curr.left, result, currDepth + 1);
        
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

TreeNode root = new TreeNode(1);
root.left = new TreeNode(2);
root.right = new TreeNode(3);
root.right.left = new TreeNode(5);
root.right.right = new TreeNode(6);
root.right.left.left = new TreeNode(7);
root.right.left.right = new TreeNode(8);
root.right.left.right.left = new TreeNode(9);
root.right.left.right.right = new TreeNode(10);
System.out.println(rightSideView(root));

	}

}
