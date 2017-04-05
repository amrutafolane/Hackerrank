//PROBLEM STATEMENT: Normal Binary Tree Traversal

class Node {
	int data;
	Node left, right;

	public Node (int item) {
		data = item;
		left = null;
		right = null;
	}
}

class BinaryTreeLevelTraversal {
	Node root;

	public printLevelOrder(Node root) {

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);

		while (!queue.isEmpty()) {

			Node temp = queue.poll();
			System.out.println(temp.data + " ");

			//enqueue the children if present
			if (temp.left != null){
				queue.add(temp.left);
			}

			if (temp.right != null){
				queue.add(temp.right);
			}			
			
		}
	}
}