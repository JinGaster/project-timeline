public class arrayQueueTest {
	public static void main(String[] args) {
		arrayQueue coolQueue = new arrayQueue(25);
		// adding to the list will take a value and add it to the end of the list.
		//for(int i = 10; i > 0; i--) {
		//	coolQueue.add(i);
		//}
		coolQueue.add("10");
		coolQueue.add("9");
		coolQueue.add("8");
		coolQueue.add("7");
		coolQueue.add("6");
		coolQueue.add("5");
		coolQueue.add("4");
		coolQueue.add("3");
		coolQueue.add("2");
		for(int i = 0; i < 14; i++) {
			coolQueue.add("1");
		}
		coolQueue.add("1"); // <-- limit of array size 25
		//coolQueue.add("1"); // <-- out of bounds
		System.out.println(coolQueue);
		//System.out.println(coolQueue.findSize());
		//System.out.println(coolQueue.testIfEmpty());
		//System.out.println(coolQueue.giveFirstElement());
		
		// removing will remove the entry at the START of the list.
		System.out.println("(removing value " + coolQueue.remove() + ")");
		System.out.println(coolQueue);
		//System.out.println(coolQueue.giveFirstElement());
		
		// trial 3
		coolQueue.add("12");
		System.out.println(coolQueue);
		
		// trial 4
		for(int i = 0; i < 23; i++) {
			coolQueue.remove();
			System.out.println(coolQueue);
			//System.out.println(coolQueue.giveFirstElement());
		}
		//System.out.println(coolQueue.giveFirstElement());
		
		// trial 5
		coolQueue.remove();
		System.out.println(coolQueue);
		System.out.println(coolQueue.testIfEmpty());
		//System.out.println(coolQueue.giveFirstElement());
		
		// trial 6
		coolQueue.add("5");
		System.out.println(coolQueue);
		coolQueue.add("3");
		System.out.println(coolQueue);
		coolQueue.add("8");
		System.out.println(coolQueue);
		
		// trial 7
		coolQueue.add("24");
		System.out.println(coolQueue);
		coolQueue.add("12");
		System.out.println(coolQueue);
		coolQueue.add("16");
		System.out.println(coolQueue);
		coolQueue.add("10");
		System.out.println(coolQueue);
		coolQueue.add("3");
		System.out.println(coolQueue);
		coolQueue.add("25");
		System.out.println(coolQueue);
		coolQueue.remove();
		System.out.println(coolQueue);
		coolQueue.remove();
		System.out.println(coolQueue);
		coolQueue.remove();
		System.out.println(coolQueue);
		coolQueue.remove();
		System.out.println(coolQueue);
		coolQueue.add("15");
		System.out.println(coolQueue);
		coolQueue.add("1");
		System.out.println(coolQueue);
		//System.out.println(coolQueue.giveFirstElement());
	}
}

// circular array