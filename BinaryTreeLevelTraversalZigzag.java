// PROBLEM STATEMENT: Write a function for Zig-Zag traversal of a Binary Tree.
public void printZigZag(Node root) {
	
	if (root == null)
		return;	//NULL check

	Stack<Node> leftToRight = new Stack<Node>();
	Stack<Node> rightToLeft = new Stack<Node>();
	
	leftToRight.push(root);

	while(!leftToRight.isEmpty() || !rightToLeft.isEmpty()){

		while (!leftToRight.isEmpty()) {
			Node temp = leftToRight.peek();
			leftToRight.pop();
			System.out.println(temp.data + " ");

			if(temp.right!= null){
				rightToLeft.push(temp.right);
			}

			if(temp.left!= null){
				rightToLeft.push(temp.left);
			}				
		}
		
		while (!rightToLeft.isEmpty()) {
			Node temp = rightToLeft.peek();
			rightToLeft.pop();
			System.out.println(temp.data + " ");

			if(temp.left!= null){
				leftToRight.push(temp.left);
			}

			if(temp.right!= null){
				leftToRight.push(temp.right);
			}		
		}
		
	}
}