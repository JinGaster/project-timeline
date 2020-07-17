//organizing room for your organizing needs
public class organizingRoom {
	public void true_remove(int data, treeNode head) {
		treeNode tempthree;
		tempthree = head;
		if(tempthree.getData() == data) {
			//System.out.println(tempthree);
			//System.out.println(tempthree.getPrevNode());
			if(tempthree.getRightNode() == null && tempthree.getLeftNode() == null) {
				//base case: when the node does not have a right or left node
				//this is where you remove the treeNode
				if(tempthree.getPrevNode().getLeftNode() != null && tempthree.getPrevNode().getLeftNode().getData() == data) {
					//if tempthree's previous node's left node is not null, but is equal to the data that is being erased, erase it.
					//System.out.println(tempthree);
					//System.out.println(tempthree.getPrevNode());
					tempthree.getPrevNode().setLeftNode(null);
				}
				if(tempthree.getPrevNode().getRightNode() != null && tempthree.getPrevNode().getRightNode().getData() == data) {
					//see the comment 6 lines above me and just do the same thing except for the right node.
					//System.out.println(tempthree);
					//System.out.println(tempthree.getPrevNode());
					tempthree.getPrevNode().setRightNode(null);
				}
				//this is the stuff after the code remove the treeNode, i.e decreasing size
				//tempthree.getPrevNode().setLeftNode(null);
				//tempthree.getPrevNode().setRightNode(null);
				tempthree = null;
				size--;
			}
			else if(tempthree.getLeftNode() != null && tempthree.getRightNode() != null) {
				//System.out.println(tempthree);
				//System.out.println(tempthree.getPrevNode());
				//else if: when the node has both a left and a right node
				//this is also where you remove the treeNode

				//okay, here's the breakdown breakdown
				//take the node, go left once, then go right as many times as you can, store that value
				//then go right once, then go left as many times as you can, store that value
				//compare those two values, see which one's closer to the node we're removing
				//replace the one that's numerically closest
				//???
				//profit.

				treeNode tempfour;
				treeNode compareone;
				treeNode comparetwo;

				tempfour = tempthree.getLeftNode();
				while(tempfour.getRightNode() != null) {
					tempfour = tempfour.getRightNode();
				}
				compareone = tempfour;

				tempfour = tempthree.getRightNode();
				while(tempfour.getLeftNode() != null) {
					tempfour = tempfour.getLeftNode();
				}
				comparetwo = tempfour;

				if(tempthree.getData() - compareone.getData() < comparetwo.getData() - tempthree.getData()) {
					//this means the less node is closer to the node that is being replaced
					tempthree = compareone;
					tempthree.setLeftNode(null);
				}
				else {
					//this means the greater node is closer to the node that is being replaced
					tempthree = comparetwo;
					tempthree.setRightNode(null);
				}
				//true_remove(data, head.getLeftNode());
				//true_remove(data, head.getRightNode());
				//System.out.println(tempthree);
				//System.out.println(tempthree.getPrevNode());
			}
			else if(tempthree.getLeftNode() == null && tempthree.getRightNode() != null) {
				//the problem: if we set tempthree's rightNode to null, the other nodes after that get deleted
				//the solution: find a way to make it so it doesn't do that
				tempthree = tempthree.getRightNode();
				while(tempthree.getRightNode() != null) {
					tempthree.setRightNode(tempthree.getRightNode().getRightNode());
					tempthree = tempthree.getRightNode();
				}
				tempthree.setRightNode(null);

			}
			else if(tempthree.getLeftNode() != null && tempthree.getRightNode() == null) {
				tempthree = tempthree.getLeftNode();
				while(tempthree.getLeftNode() != null) {
					tempthree.setLeftNode(tempthree.getLeftNode().getLeftNode());
					tempthree = tempthree.getLeftNode();
				}
				tempthree.setLeftNode(null);
			}
			tempthree = null;
			size--;
		}
		else if(tempthree.getLeftNode() != null && tempthree.getRightNode() != null) {
			//else if: the node has both a left node, and a right node
			//System.out.println(tempthree);
			//System.out.println(tempthree.getPrevNode());
			true_remove(data, head.getLeftNode());
			true_remove(data, head.getRightNode());
		}
		else if(tempthree.getLeftNode() == null && tempthree.getRightNode() != null) {
			//else if: the node has a right node, but not a left node
			//System.out.println(tempthree);
			//System.out.println(tempthree.getPrevNode());
			true_remove(data, head.getRightNode());
		}
		else if(tempthree.getLeftNode() != null && tempthree.getRightNode() == null) {
			//else if: the node has a left node, but not a right node
			//System.out.println(tempthree);
			//System.out.println(tempthree.getPrevNode());
			true_remove(data, head.getLeftNode());
		}
		//good recursive calls
	}
	
	public void remove(int data) {
		if(size == 1) {
			head = null;
		}
		else {
			true_remove(data, head);
		}
	}
}
