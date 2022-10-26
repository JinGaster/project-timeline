public class genericTree<E extends Comparable<E>> {
	private int size = 1;
	private treeNode<E> head;
	public genericTree(Comparable<E> d) {
		head = new treeNode(null, null, d, null);
	}
	private treeNode<E> nodeEnd;
	public void true_add(E data, treeNode<E> tempone) {
		//the problem: these recursive calls are not stopping at the first possible option, but rather the last possible option.
		//base case: when the node does not have a right or left node
		//this is where you add the treeNode
		//System.out.println(data.compareTo(tempone.getData()));
		//System.out.println(tempone.getRightNode());
		if((data.compareTo(tempone.getData()) < 0 || data.compareTo(tempone.getData()) == 0) && tempone.getLeftNode() == null) {
			//System.out.println(tempone.getLeftNode());
			//System.out.println("adding left node...");
			nodeEnd = new treeNode(null, null, data, tempone);
			tempone.setLeftNode(nodeEnd);
			//System.out.println(nodeEnd);
			size++;
		}
		else if(data.compareTo(tempone.getData()) > 0 && tempone.getRightNode() == null) {
			//System.out.println("adding right node...");
			nodeEnd = new treeNode(null, null, data, tempone);
			tempone.setRightNode(nodeEnd);
			//System.out.println(nodeEnd);
			size++;
		}
		else if(data.compareTo(tempone.getData()) > 0 && tempone.getRightNode() != null) {
			//else if: when the data is greater than the node that tempone is on
			//System.out.println("pineapple");
			true_add(data, tempone.getRightNode());
		}
		else if((data.compareTo(tempone.getData())) < 0 && tempone.getLeftNode() != null) {
			//else if: when the data is less than the node that tempone is on
			//System.out.println("orange");
			true_add(data, tempone.getLeftNode());
		}
		//good recursive calls
	}
	public void add(E data) {
		true_add(data, head);
	}

	public void true_remove(E data, treeNode<E> head) {
		treeNode<E> tempthree;
		tempthree = head;
		// tempthree starts at the head node, and traverses down the tree until it finds the node it needs to remove.
		// supposedly, removing 6 and 30 in the treeTest class does not work...
		// System.out.println(tempthree.getData() == data); (when removing 30, outputs true when tempthree.getData() = 30)
		if(tempthree.getData().compareTo(data) == 0) {
			if(tempthree.getPrevNode() == null) {
				//System.out.println("123");
				// base case: when the node does not have a previous node (when the head node is deleted)
				//System.out.println("a");
				if(tempthree.getLeftNode() != null && tempthree.getRightNode() == null) {
					// when the head has a left node but not a right one, set the left one to the head
					head = tempthree.getLeftNode();
				}
				else if(tempthree.getLeftNode() == null && tempthree.getRightNode() != null) {
					// when the head has a right node but not a left one, set the right one to the head
					head = tempthree.getRightNode();
				}
				else if(tempthree.getLeftNode() != null && tempthree.getRightNode() != null) {
					//if(head.getRightNode().getData() - head.getData() < head.getData() - head.getLeftNode().getData()) {
						// the node to the right of head is closer to the head itself than the left one
						//System.out.println("abc");
					//	head.getLeftNode().setPrevNode(head.getRightNode());
					//	head = head.getRightNode();
					//}
					//else {
						// the node to the left of head is closer to the head itself than the right one
						//System.out.println("123");
						// in this case this is what happens instead of the other if statement (given the children of head treeNode 0
						// are -5 and 8).
						//head.getRightNode().setPrevNode(head.getLeftNode());
					//	head.setData(head.getLeftNode().getData());
						//tempthree.getRightNode().setPrevNode(tempthree.getPrevNode());
					//}
					
					// this is the procedure of removing a node with two children
					// when the head has both a left node and a right one, set the head as the closer of the two
					treeNode<E> tempfour;
					treeNode<E> compareone;

					// step 1: go to the left of the head, then go as far as you can to the right. store this value.
					tempfour = head.getLeftNode();
					while(tempfour.getRightNode() != null) {
						tempfour = tempfour.getRightNode();
					}
					compareone = tempfour; /*saving this node for future comparison*/

					// step 2: do the same thing but go right, then go left as far as you can. store this value again.
					tempfour = head.getRightNode();
					while(tempfour.getLeftNode() != null) {
						tempfour = tempfour.getLeftNode(); /*we'll be comparing this with the node we got earlier*/
					}

					// step 3: compare the two values that were just stored so you can replace the head with the one
					// that is closest to the head's value.
					//if(head.getData() - compareone.getData().compareTo(tempfour.getData() - head.getData()) == -1) {
					if(true) {
						// see line 224-225
						//this means the lesser node is closer to the node that is being replaced
						//System.out.println("123");
						E compareOneData = compareone.getData();
						//System.out.println(compareOneData); /*outputs -5*/
						removeData(compareone.getData()); /*this is supposed to remove -5 and put it where 0 is, but it's not...*/
						if(true) {
							if(true) {
								if(true) {
									if(true) {
										if(true) {
											head.setData(compareOneData);
											// haha
										}
									}
								}
							}
						}
						//System.out.println(compareOneData); /*outputs -5*/
						//System.out.println(head.getData()); /*outputs 0, should output -5*/
					}
					//else {
						//this means the greater node is closer to the node that is being replaced
					//	E tempFourData = tempfour.getData();
					//	remove(tempfour.getData());
					//	head.setData(tempFourData);
					//}
					
					// print statements
					//System.out.println(head); /*outputs 0, should output -5*/
					//System.out.println(head.getRightNode()); /*outputs 8*/
					//System.out.println(head.getRightNode().getPrevNode()); /*outputs -5*/
					//System.out.println(head.getLeftNode()); /*outputs null*/
				}
			}
			else if(tempthree.getLeftNode() == null && tempthree.getRightNode() == null) {
				//System.out.println("456");
				//(not) base case (anymore): when the node does not have a right or left node
				//this is where you remove the treeNode
				//System.out.println(tempthree.getData()); /*oh, this is the line that prints out 30*/
				// in both if command cases, tempthree is where there is no left node or right node, so
				// these two if command test if the node tempthree is on is the left or right node of the previous node
				// that way, it will know exactly which node to delete
				
				//print command testing facility
				//System.out.println(tempthree.getPrevNode().getLeftNode() != null && tempthree.getPrevNode().getLeftNode().getData() == data);
				//System.out.println(tempthree.getPrevNode().getRightNode() != null && tempthree.getPrevNode().getRightNode().getData() == data);
				//System.out.println(tempthree.getPrevNode()); /*outputs...54??*/
				//System.out.println(tempthree.getPrevNode().getLeftNode()); /*outputs 30*/
				
				if(tempthree.getPrevNode().getLeftNode() != null && tempthree.getPrevNode().getLeftNode().getData().equals(data)) {
					//if tempthree's previous node's left node is not null, but is equal to the data that is being erased, erase it.
					//System.out.println("apple");
					tempthree.getPrevNode().setLeftNode(null);
				}
				// the problem v2: when the list wants to remove 30, it triggers the first if statement and not the second if statement (solved)
				// the solution (most likely): make the node with value 30 not attach itself to 54 and instead to 25
				if(tempthree.getPrevNode().getRightNode() != null && tempthree.getPrevNode().getRightNode().getData().equals(data)) {
					//System.out.println("orange");
					//System.out.println(tempthree.getPrevNode().getRightNode()); /*outputs 25*/
					//System.out.println(tempthree.getPrevNode()); /*outputs 10*/
					tempthree.getPrevNode().setRightNode(null);
					//System.out.println(tempthree.getPrevNode().getRightNode()); /*outputs null*/
				}
				// the problem v3: treenode with value 25 is not being removed
				//this is the stuff after the code remove the treeNode, i.e decreasing size
				//tempthree = null;
			}
			else if(tempthree.getLeftNode() != null && tempthree.getRightNode() == null) {
				//System.out.println("789");
				// when tempthree's left node is not null, but the right one is, set the node tempthree is on to
				// whatever was to the left of it
				
				// okay so when removing 54, this somehow caused 30 to not attach itself to 25
				// print statement testing facility 2
				//if(data == 54) {
					//System.out.println(tempthree.getPrevNode().getLeftNode() != null); /*should output false*/
					//System.out.println(tempthree.getPrevNode().getRightNode() != null); /*should output true*/
					//System.out.println(tempthree.getLeftNode()); /*should output 30*/
					//System.out.println(tempthree.getLeftNode().getPrevNode()); /*should output 54*/
				//}
				
				if(tempthree.getPrevNode().getLeftNode() != null && tempthree.getPrevNode().getLeftNode().getData().equals(data)) {
					tempthree.getPrevNode().setLeftNode(tempthree.getLeftNode());
				}
				else if(tempthree.getPrevNode().getRightNode() != null && tempthree.getPrevNode().getRightNode().getData().equals(data)) {
					tempthree.getPrevNode().setRightNode(tempthree.getLeftNode());
					//System.out.println(tempthree.getLeftNode()); /*outputs 30*/
					//System.out.println(tempthree.getLeftNode().getPrevNode()); /*outputs 54 (same as tempthree), but should output 25*/
					//System.out.println(tempthree.getPrevNode().getRightNode()); /*outputs 30*/
					//System.out.println(tempthree.getPrevNode()); /*outputs 25*/
					tempthree.getLeftNode().setPrevNode(tempthree.getPrevNode()); /*sets 30's previous node to 25*/
				}
			}
			else if(tempthree.getLeftNode() == null && tempthree.getRightNode() != null) {
				//System.out.println("012");
				if(tempthree.getPrevNode().getRightNode() != null && tempthree.getPrevNode().getRightNode().getData().equals(data)) {
					//System.out.println("apple");
					tempthree.getPrevNode().setRightNode(tempthree.getRightNode());
					tempthree.getRightNode().setPrevNode(tempthree.getPrevNode());
				}
				else if(tempthree.getPrevNode().getLeftNode() != null && tempthree.getPrevNode().getLeftNode().getData().equals(data)) {
					//System.out.println(tempthree.getRightNode());
					//System.out.println(tempthree);
					//System.out.println(tempthree.getPrevNode());
					//tempthree.getRightNode().setPrevNode(tempthree.getPrevNode());
					tempthree.getRightNode().setPrevNode(tempthree.getPrevNode());
					tempthree.getPrevNode().setLeftNode(tempthree.getRightNode());
					//System.out.println(tempthree.getPrevNode().getRightNode());
					//tempthree.getLeftNode().setPrevNode(tempthree.getPrevNode());
				}
			}
			else if(tempthree.getLeftNode() != null && tempthree.getRightNode() != null) {
				//System.out.println("345");
				//else if: when the node has both a left and a right node
				//this is also where you remove the treeNode

				//take the node, go left once, then go right as many times as you can, store that value
				//then go right once, then go left as many times as you can, store that value
				//compare those two values, see which one's closer to the node we're removing
				//replace the one that's numerically closest

				treeNode<E> tempfour;
				treeNode<E> compareone;

				tempfour = tempthree.getLeftNode();
				while(tempfour.getRightNode() != null) {
					tempfour = tempfour.getRightNode();
				}
				compareone = tempfour;

				tempfour = tempthree.getRightNode();
				while(tempfour.getLeftNode() != null) {
					tempfour = tempfour.getLeftNode();
				}
				//if(tempthree.getData() - compareone.getData().compareTo(tempfour.getData() - tempthree.getData()) == -1) {
				//if(false) {
					//this means the less node is closer to the node that is being replaced
				//	E compareOneData = compareone.getData();
				//	remove(compareone.getData());
				//	tempthree.setData(compareOneData);
				//
				//}
				//else {
					// so it doesn't actually matter which node is closest to the one being replaced, so here, it defaults
					// to replacing the node with the one on the right
					//this means the greater node is closer to the node that is being replaced
					E tempFourData = tempfour.getData();
					//System.out.println("ignore value below");
					removeData(tempfour.getData());
					tempthree.setData(tempFourData);
				//}
				//true_remove(data, head.getLeftNode());
				//true_remove(data, head.getRightNode());
				//System.out.println(tempthree);
				//System.out.println(tempthree.getPrevNode());
			}
		}
		// figure out why nodeEnd is used here: nodeEnd is the node at the end of the statement printed.
		// okay so i replaced nodeEnd.getData() with just data itself, this solves the problem of not removing 6,
		// but does not solve the problem of removing 30.
		else if(data.compareTo(tempthree.getData()) > 0) {
			true_remove(data, head.getRightNode());
		}
		else if(data.compareTo(tempthree.getData()) < 0) {
			true_remove(data, head.getLeftNode());
		}
		//good recursive calls
	}
	public void remove(E data) {
		if(size == 1) {
			System.out.println("the list below has 0 elements.");
			head = null;
		}
		else {
			if(size == 2) {
				System.out.println("the list below has 1 element.");
			}
			else {
				System.out.println("the list below has " + (size-1) + " elements.");
			}
			true_remove(data, head);
		}
		size--;
	}
	public void removeData(E data) {
		if(size == 1) {
			head = null;
		}
		else {
			true_remove(data, head);
		}
	}
	
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


	public String true_toString(treeNode head) {
		String temp = "";
		treeNode<E> temptwo;
		temptwo = head;
		// the string "temp" is an empty string that will be used to display what the tree is.
		// the treeNode "temptwo" starts at the head node, then progressively reads down the binary tree, and
		// depending on certain cases, it will attach the node it's on to the string "temp".
		if(size == 0) {
			// base case: when the list is empty
			return "(empty)";
		}
		else if(temptwo.getRightNode() == null && temptwo.getLeftNode() == null) {
			//(not) base case (anymore): when the node does not have a right or left node
			//this is where you stop the toString
			//System.out.println("tree");
			return temp+= ""+ temptwo +"";
		}
		else if(temptwo.getLeftNode() != null && temptwo.getRightNode() != null) {
			//else if: when the node has both a left and a right node
			// in this case, it will read everything that is to the left of the node, followed by whatever
			// is to the right of the node.
			temp+= ""+ temptwo + /*head.getPrevNode() + head.getLeftNode() + head.getRightNode() +*/ "" + true_toString(head.getLeftNode());
			temp+= "" + /*head.getPrevNode() + head.getLeftNode() + head.getRightNode() +*/ "" + true_toString(head.getRightNode());
		}
		else if(temptwo.getLeftNode() != null && temptwo.getRightNode() == null) {
			//else if: the node has a left node, but not a right node
			temp+= ""+ temptwo + /*head.getPrevNode() + head.getLeftNode() + head.getRightNode() +*/ "" + true_toString(head.getLeftNode());
		}
		else if(temptwo.getLeftNode() == null && temptwo.getRightNode() != null) {
			//else if: the node has a right node, but not a left node
			temp+= ""+ temptwo + /*head.getPrevNode() + head.getLeftNode() + head.getRightNode() +*/ "" + true_toString(head.getRightNode());
		}
		//recursive calls
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