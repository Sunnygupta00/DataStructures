package tree;

//class Node {
//	static int data;
//	//storing refrences
//	Node Left;
//	Node Right;
//
//	Node(int key) {
//		data = key;
//	}
//}

public class Tree_Intro {

	public static void main(String[] args) {
		Node tree = new Node(1);
		tree.Left = new Node(2);
		tree.Right = new Node(3);
		tree.Left.Left = new Node(4);

	}

}
