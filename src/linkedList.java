
public class linkedList {
	private int size = 1;
	private node head;
	public linkedList(int d) {
		head = new node(null, d);
	}
	
	
	//first use a constructor to define your linkedList, where you set head as int d and nextNode null (done)
	
	//then, make a new node, set it to the very end of the list, and then add that there / make an add function (done)
	//-for the node at the end of the list, after head, it is unknown what the next node is, but that value is one
	// more after all the previous nodes
	//add a remove function, for removing a certain node / add a remove function (done)
	//-find a way to take a node, and erase it by setting it to null
	
	//make a toString so the linked list won't just spit out void text (done)
	//-while a checking system is within the boundaries of this list, convert each node into a better node that can
	// actually be read
	//print the linked list (done)
	//-make a temptwo such that it can read the list along with each of the nodes' data values and their next nodes
	//print out the list
	//profit
	
	//also do a buncha other stuff like addPosition and removePosition
	//- but i'm too lazy to scroll up here every single time, so i might as well record those
	//  comments at the actual function area
	
	private node nodeEnd;
	public void add(int data) {
		node tempthree;
		tempthree = head;
		nodeEnd = new node(null, data);
		if(size==1) {
			//tempthree = head.getNextNode();
			//nodeEnd = tempthree;
			head.setNextNode(nodeEnd);
		}
		else if(size > 1) {
			while(tempthree.getNextNode() != null){
				//tempthree.setNextNode(head.getNextNode());
				//make tempthree cycle through the other nodes
				//tempthree.setNextNode(tempthree); <<< BAD LINE OF CODE
				tempthree = tempthree.getNextNode();
			}
			//System.out.println(tempthree.getData());
			//System.out.println(nodeEnd);
			tempthree.setNextNode(nodeEnd);
			//nodeEnd = tempthree;
			//tempthree = tempthree.getNextNode();
			//nodeEnd.setNextNode(nodeEnd);
		}
		size++;
	}
	//adding nodes to the end of the list
	
	public void remove(int data) {
		node tempfour;
		tempfour = head;
		nodeEnd = null;
		while(tempfour.getNextNode() != null) {
			tempfour = tempfour.getNextNode();
			if(tempfour.getNextNode() == null) {
				nodeEnd.setNextNode(null);
			}
			//set the previous's node's next node to null
			nodeEnd = tempfour;
		}
		size--;
	}
	//removing nodes
	
	public String toString() {
		String temp = "";
		node temptwo;
		temptwo = head;
		int check = 0;
		while(temptwo.getNextNode() != null) {
			temp+= ""+ temptwo +"..";
			check++;
			temptwo = temptwo.getNextNode();
			//System.out.println(check);
			//System.out.println(temptwo.getData());
		}
		//System.out.println("linkedList");
		return temp;
		//while this check thingy is within the node list, convert it to better, more comprehensible information
		//use temp to do this
	}
	
	public void addPosition(int data, int position) {
		node tempfive;
		tempfive = head;
		
		if(position > size) {
			System.out.println("That position exceeds the size of the list. Returning previous list.");
		}
		else if(position < 0){
			System.out.println("that position is less than 0, bruh.");
		}
		else {
			for(int ap = 1; ap < position; ap++) {
				tempfive = tempfive.getNextNode();
			}
			node added_node = new node(tempfive.getNextNode(), data);
			//add the node in this position
			//ok but what if the new node's position is like 99999999999999999?
			//hmmmmmm
			tempfive.setNextNode(added_node);
			
			//now set the previous node's next node as added_node
			//tempfive = head;
			//for(int ap_two = 1; ap_two <= position-1; ap_two++) {
			//	tempfive = tempfive.getNextNode();
			//}
			//this makes tempfive go to the previous node of added_node
			//now set the previous node's next node as added_node
			//how to set the nextNode of a node that can't be interacted
			//oh wait temp is already at the right location lol
		}
		//while(tempfive.getNextNode() != /*the position of ap*/) {
		//	tempfive = tempfive.getNextNode();
		//	ap++;
		//}
		//this is incorrect code bruh
	}
	//allows the user to add a node to a certain position, with a certain data value
	
	public void removePosition(int position) {
		node tempsix;
		tempsix = head;
		if(position > size) {
			System.out.println("That position exceeds the size of the list. Returning previous list.");
		}
		else if(position < 0){
			System.out.println("that position is less than 0, bruh.");
		}
		else {
			for(int rp = 1; rp <= position-1; rp++) {
				tempsix = tempsix.getNextNode();
			}
			//delete the node by making its next node the next node of the next node of that
			tempsix.setNextNode(tempsix.getNextNode().getNextNode());

			//get rid of the node here, and then detach the previous node from that node
			//also make an if statement saying if the node with a specific position and a
			// specific data value even exists in the first place

			//while(tempsix.getNextNode() != /*the position of rp*/) {
			//	tempsix = tempsix.getNextNode();
			//	rp++;
			//}
			//this is incorrect code bruh
		}
	}
	//allows the user to remove a node from a certain position, with a certain data value
}
