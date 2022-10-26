public class arrayStackTest {
	public static void main(String[] args) {
		arrayStack coolStack = new arrayStack(25);
		// adding to the list will take a value and add it to the end of the list.
		//for(int i = 10; i > 0; i--) {
		//	coolStack.add(i);
		//}
		coolStack.add("10");
		coolStack.add("9");
		coolStack.add("8");
		coolStack.add("7");
		coolStack.add("6");
		coolStack.add("5");
		coolStack.add("4");
		coolStack.add("3");
		coolStack.add("2");
		coolStack.add("1");
		System.out.println(coolStack);
		//System.out.println(coolStack.findSize());
		//System.out.println(coolStack.testIfEmpty());
		//System.out.println(coolStack.giveFirstElement());
		
		// removing will remove the entry at the end of the list.
		System.out.println(coolStack.remove());
		System.out.println(coolStack);
		//System.out.println(coolStack.giveFirstElement());
		
		// trial 3
		coolStack.add("12");
		System.out.println(coolStack);
		
		// trial 4
		for(int i = 0; i < 10; i++) {
			coolStack.remove();
			System.out.println(coolStack);
		}
		//System.out.println(coolStack.giveFirstElement());
		
		// trial 5
		coolStack.remove();
		System.out.println(coolStack);
		//System.out.println(coolStack.testIfEmpty());
		//System.out.println(coolStack.giveFirstElement());
	}
}
