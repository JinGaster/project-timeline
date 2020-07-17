
public class treeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tree oaktree = new tree(0);
		//making a new tree
		
		System.out.println("headNode: " + oaktree);
		//printing out that new tree
		
		System.out.println("----------------------------------");
		System.out.println("okay time to add nodes");
		System.out.println("----------------------------------");
		
		oaktree.add(4);
		oaktree.add(8);
		oaktree.add(10);
		oaktree.add(25);
		System.out.println("firstAdd statements: " + oaktree);
		
		oaktree.add(6);
		//System.out.println("[added 6] nextAdd statements: " + oaktree);
		oaktree.add(54);
		//System.out.println("[added 54] nextAdd statements: " + oaktree);
		oaktree.add(30);
		System.out.println("secondAdd statements: " + oaktree);
		//adding treeNodes
		
		System.out.println("----------------------------------");
		System.out.println("okay time to remove nodes now");
		System.out.println("----------------------------------");
		
		oaktree.remove(4);
		System.out.print("firstRemove statements: ");
		System.out.println(oaktree);
		oaktree.remove(10);
		System.out.print("SecondRemove statements: ");
		System.out.println(oaktree);
		
		oaktree.remove(54);
		oaktree.remove(6);
		oaktree.remove(30);
		System.out.print("thirdRemove statements: ");
		System.out.println(oaktree);
		//removing treeNodes
		
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
	}
}
