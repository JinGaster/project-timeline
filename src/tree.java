
public class tree {
	private int size = 1;
	private treeNode head;
	public tree(int d) {
		head = new treeNode(null, null, d, null);
	}
	private treeNode nodeEnd;
	public void true_add(int data, treeNode tempone) {
		//the problem: these recursive calls are not stopping at the first possible option, but rather the last possible option.
		//the solution: do something
		//base case: when the node does not have a right or left node
		//this is where you add the treeNode
		if(data <= tempone.getData() && tempone.getLeftNode() == null) {
			//System.out.println("adding left node...");
			nodeEnd = new treeNode(null, null, data, tempone);
			tempone.setLeftNode(nodeEnd);
			//System.out.println(nodeEnd);
			size++;
		}
		else if(data > tempone.getData() && tempone.getRightNode() == null) {
			//System.out.println("adding right node...");
			nodeEnd = new treeNode(null, null, data, tempone);
			tempone.setRightNode(nodeEnd);
			//System.out.println(nodeEnd);
			size++;
		}
		else if(data > tempone.getData() && tempone.getRightNode() != null) {
			//else if: when the data is greater than the node that tempone is on
			//System.out.println("pineapple");
			true_add(data, tempone.getRightNode());
		}
		else if(data < tempone.getData() && tempone.getLeftNode() != null) {
			//else if: when the data is less than the node that tempone is on
			//System.out.println("orange");
			true_add(data, tempone.getLeftNode());
		}
		//good recursive calls
	}
	public void add(int data) {
		true_add(data, head);
	}

	public void true_remove(int data, treeNode head) {
		treeNode tempthree;
		tempthree = head;
		if(tempthree.getData() == data) {
			if(tempthree.getLeftNode() == null && tempthree.getRightNode() == null) {
				//base case: when the node does not have a right or left node
				//this is where you remove the treeNode
				System.out.println(tempthree.getData());
				if(tempthree.getPrevNode().getLeftNode() != null && tempthree.getPrevNode().getLeftNode().getData() == data) {
					//if tempthree's previous node's left node is not null, but is equal to the data that is being erased, erase it.
					tempthree.getPrevNode().setLeftNode(null);
				}
				if(tempthree.getPrevNode().getRightNode() != null && tempthree.getPrevNode().getRightNode().getData() == data) {
					tempthree.getPrevNode().setRightNode(null);
				}
				//this is the stuff after the code remove the treeNode, i.e decreasing size
				//tempthree = null;
				size--;
			}
			else if(tempthree.getLeftNode() != null && tempthree.getRightNode() == null) {
				if(tempthree.getPrevNode().getLeftNode() != null && tempthree.getPrevNode().getLeftNode().getData() == data) {
					tempthree.getPrevNode().setLeftNode(tempthree.getLeftNode());
				}
				else if(tempthree.getPrevNode().getRightNode() != null && tempthree.getPrevNode().getRightNode().getData() == data) {
					tempthree.getPrevNode().setRightNode(tempthree.getLeftNode());
				}
			}
			else if(tempthree.getLeftNode() == null && tempthree.getRightNode() != null) {
				if(tempthree.getPrevNode().getRightNode() != null && tempthree.getPrevNode().getRightNode().getData() == data) {
					tempthree.getPrevNode().setRightNode(tempthree.getRightNode());
				}
				else if(tempthree.getPrevNode().getLeftNode() != null && tempthree.getPrevNode().getLeftNode().getData() == data) {
					tempthree.getPrevNode().setLeftNode(tempthree.getLeftNode());
				}
			}
			else if(tempthree.getLeftNode() != null && tempthree.getRightNode() != null) {
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

				tempfour = tempthree.getLeftNode();
				while(tempfour.getRightNode() != null) {
					tempfour = tempfour.getRightNode();
				}
				compareone = tempfour;

				tempfour = tempthree.getRightNode();
				while(tempfour.getLeftNode() != null) {
					tempfour = tempfour.getLeftNode();
				}

				if(tempthree.getData() - compareone.getData() < tempfour.getData() - tempthree.getData()) {
					//this means the less node is closer to the node that is being replaced
					int compareOneData = compareone.getData();
					remove(compareone.getData());
					tempthree.setData(compareOneData);

				}
				else {
					//this means the greater node is closer to the node that is being replaced
					int tempFourData = tempfour.getData();
					remove(tempfour.getData());
					tempthree.setData(tempFourData);
				}
				//true_remove(data, head.getLeftNode());
				//true_remove(data, head.getRightNode());
				//System.out.println(tempthree);
				//System.out.println(tempthree.getPrevNode());
			}
		}
		else if(nodeEnd.getData() > tempthree.getData()) {
			true_remove(data, head.getRightNode());
		}
		else if(nodeEnd.getData() < tempthree.getData()) {
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

	//THIS IS THE SEA OF COMMENTED CODE, PROCEED WITH CAUTION!
	//"old" code below, new code above

	/*treeNode tempone;
		tempone = head;
		nodeEnd = new treeNode(null, null, data);
		boolean bool_one = true;
		boolean bool_two = true;
		boolean bool_three = true;
		//make something like a break command or a boolean that makes the loop to stop
		while(bool_one) {
			if(size == 1) {
				if(nodeEnd.getData() > head.getData() || nodeEnd.getData() == head.getData()) {
					head.setRightNode(nodeEnd);
				}
				else if(nodeEnd.getData() < head.getData()) {
					head.setLeftNode(nodeEnd);
				}
				bool_one = false;
			}
			else if(size > 1) {
				if(nodeEnd.getData() > tempone.getData() || nodeEnd.getData() == tempone.getData()) {
					while(bool_two){
						//make tempone cycle through the other nodes
						//tempone.setNextNode(tempone); <<< BAD LINE OF CODE
						tempone = tempone.getRightNode();
						if(nodeEnd.getData() >= tempone.getData() && tempone.getRightNode() == null) {
							tempone.setRightNode(nodeEnd);
							bool_one = false;
							System.out.println(tempone.getData());
							System.out.println(nodeEnd.getData());
							bool_two = false;
						}
					}
				}
				else if(nodeEnd.getData() < tempone.getData()) {
					while(bool_three){
						//make tempone cycle through the other nodes
						tempone = tempone.getLeftNode();
						if(nodeEnd.getData() <= tempone.getData() && tempone.getLeftNode() == null) {
							tempone.setLeftNode(nodeEnd);
							bool_one = false;
							//System.out.println(tempone.getData());
							//System.out.println(nodeEnd.getData());
							bool_three = false;
						}
						else {
							bool_three = false;
						}
					}
				}
			}
			size++;
		}*/

	/*if(nodeEnd.getData() > head.getData() || nodeEnd.getData() == head.getData()) {
			if(size==1) {
				head.setNextNode(nodeEnd);
			}
			else if(size > 1) {
				while(tempone.getNextNode() != null){
					//make tempone cycle through the other nodes
					//tempone.setNextNode(tempone); <<< BAD LINE OF CODE
					tempone = tempone.getNextNode();
				}
				//System.out.println(tempone.getData());
				//System.out.println(nodeEnd);
				tempone.setNextNode(nodeEnd);
			}
			size++;
		}
		else if(nodeEnd.getData() < head.getData()) {
			if(size==1) {
				nodeEnd.setNextNode(head);
			}
			else if(size > 1) {
				nodeEnd.setLeftNode();
			}
		}*/

	//this is just weird code, ignore this lol
	//THIS IS THE END OF THE SEA OF THE COMMENTED CODE, YOU CAN NOW STOP PROCEEDING WITH CAUTION

	public String true_toString(treeNode head) {
		String temp = "";
		treeNode temptwo;
		temptwo = head;
		if(temptwo.getRightNode() == null && temptwo.getLeftNode() == null) {
			//base case: when the node does not have a right or left node
			//this is where you stop the toString
			//System.out.println("tree");
			return temp+= ""+ temptwo +"";
		}
		else if(temptwo.getLeftNode() != null && temptwo.getRightNode() != null) {
			//else if: when the node has both a left and a right node
			temp+= ""+ temptwo + /*head.getPrevNode() + head.getLeftNode() + head.getRightNode() +*/ "" + true_toString(head.getLeftNode());
			temp+= "" + /*head.getPrevNode() + head.getLeftNode() + head.getRightNode() +*/ "" + true_toString(head.getRightNode());
		}
		else if(temptwo.getLeftNode() != null && temptwo.getRightNode() == null) {
			//else if: the node has a right node, but not a left node
			temp+= ""+ temptwo + /*head.getPrevNode() + head.getLeftNode() + head.getRightNode() +*/ "" + true_toString(head.getLeftNode());
		}
		else if(temptwo.getLeftNode() == null && temptwo.getRightNode() != null) {
			//else if: the node has a left node, but not a right node
			temp+= ""+ temptwo + /*head.getPrevNode() + head.getLeftNode() + head.getRightNode() +*/ "" + true_toString(head.getRightNode());
		}
		//good recursive calls
		return temp;
	}

	public String toString() {
		return true_toString(head);
	}

	//int check = 0;
	/*while(temptwo.getLeftNode() != null) {
			temp+= ""+ temptwo +"..";
			if(temptwo.getRightNode() != null) {
				temptwo = temptwo.getRightNode();
				if(temptwo.getLeftNode() != null) {

				}
				else if(temptwo.getRightNode() != null) {

				}
			}
			//check++;
			temptwo = temptwo.getLeftNode();
			//System.out.println(check);
			//System.out.println(temptwo.getData());
		}
		temptwo = head;
		temptwo = temptwo.getRightNode();
		while(temptwo.getRightNode() != null) {
			temp+= ""+ temptwo +"..";
			//check++;
			temptwo = temptwo.getRightNode();
			//System.out.println(check);
			//System.out.println(temptwo.getData());
		}*/
}

//289 lines of code, ultrapog