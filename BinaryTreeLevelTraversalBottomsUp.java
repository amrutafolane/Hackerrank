//PROBLEM STATEMENT: Binary Tree Traversal Bottom to Top.

class Node {
	int data;
	Node left, right;

	public Node (int item) {
		data = item;
		left = null;
		right = null;
	}
}

class BinaryTreeLevelTraversalBottumsUp {

	Node root;

	public printLevelOrder() {

		Stack<Node> s = new Stack<Node>();
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		while(!q.isEmpty()) {

			root = q.peek();
			q.remove();
			s.push(root);

			if (root.right != null) {
				s.push(root.right);
			}

			if (root.left != null) {
				s.push(root.left);
			}
		}

		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
}

