
public class linkedListTest {
	public static void main(String[] args) {
		linkedList<Integer> listoflink = new linkedList<Integer>(0);
		//making a new linked list
		
		for(int x=1; x<=11; x++) {
			listoflink.add(x);
		}
		System.out.println(listoflink);
		//adding nodes
		
		for(int y=5; y>=1; y--) {
			listoflink.remove(y);
		}
		System.out.println(listoflink);
		//removing nodes
		
		listoflink.addPosition(5, 2);
		System.out.println(listoflink);
		//adding a new node with a certain value and position
		
		listoflink.removePosition(3);
		System.out.println(listoflink);
		//removing a node at a certain position
	}
}
//be aware the node values start at 0