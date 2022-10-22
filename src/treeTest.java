
public class treeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		genericTree<String> oaktree = new genericTree<String>("0");
		//making a new <generic> tree
		
		System.out.println("headNode: " + oaktree);
		//printing out that new tree
		
		System.out.println("----------------------------------");
		System.out.println("      add nodes");
		System.out.println("----------------------------------");
		
		oaktree.add("4");
		//System.out.println("[added 4] add statement: " + oaktree);
		oaktree.add("8");
		//System.out.println("[added 8] add statement: " + oaktree);
		oaktree.add("10");
		//System.out.println("[added 10] add statement: " + oaktree);
		oaktree.add("25");
		//System.out.println("[added 25] add statement: " + oaktree);
		System.out.println("[added 4, 8, 10, 25] add statement: " + oaktree);
		
		oaktree.add("6");
		System.out.println("[added 6] secondAdd statements: " + oaktree);
		oaktree.add("54");
		System.out.println("[added 54] thirdAdd statements: " + oaktree);
		oaktree.add("30");
		System.out.println("[added 30] fourthAdd statements: " + oaktree);
		
		//special
		oaktree.add("-5");
		System.out.println("[added -5] fifthAdd statements: " + oaktree); /*oh wow that actually worked*/
		//adding treeNodes
		
		System.out.println("----------------------------------");
		System.out.println("    remove nodes");
		System.out.println("----------------------------------");
		
		oaktree.remove("4");
		System.out.print("[removed 4] firstRemove statements: ");
		System.out.println(oaktree);
		oaktree.remove("10");
		System.out.print("[removed 10] secondRemove statements: ");
		System.out.println(oaktree);
		
		oaktree.remove("54");
		System.out.print("[removed 54] thirdRemove statements: ");
		System.out.println(oaktree);
		oaktree.remove("6");
		// problem #1: does not remove 6 (solved by comparing data to the traversing node instead of nodeEnd).
		System.out.print("[removed 6] fourthRemove statements: ");
		System.out.println(oaktree);
		oaktree.remove("30");
		// problem #2: does not remove 30 (solved by setting 30's previous node to 25 back when 54 was removed).
		System.out.print("[removed 30] fifthRemove statements: ");
		System.out.println(oaktree);
		
		//special
		oaktree.remove("0");
		// problem #3: cannot remove 0 and instead breaks program b/c head node has no prevNode (solved by editing setData to be the right thing)
		System.out.print("[removed 0] sixthRemove statements: ");
		System.out.println(oaktree);
		
		oaktree.remove("25");
		System.out.println("[removed 25] seventhRemove statements: " + oaktree);
		oaktree.remove("8");
		System.out.println("[removed 8] eighthRemove statements: " + oaktree);
		
		oaktree.remove("-5");
		// problem #4: cannot remove -5 when it is the only node (fixed by putting size--; commands in the correct place and making a function with an absurdly long name)
		System.out.println("[removed -5] ninthRemove statements: " + oaktree);
		//removing treeNodes
	}
}

//linkedListTest code
/*for(int y=5; y>=1; y--) {
	listoflink.remove(y);
}
System.out.println(listoflink);
//removing nodes

listoflink.addPosition(5, 2);
System.out.println(listoflink);
//adding a new node with a certain value and position

listoflink.removePosition(3);
System.out.println(listoflink);
//removing a node at a certain position*/