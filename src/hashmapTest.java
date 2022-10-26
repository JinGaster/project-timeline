public class hashmapTest {
	public static void main(String[] args) {
		hashmap<String, String> hash = new hashmap();
		System.out.println("hashmap entry 1: " + hash);
		// making new hashmap
		
		System.out.println("----------------------------------");
		System.out.println("             trial 1");
		System.out.println("----------------------------------");
		
		hash.add("5", "Gregg");
		System.out.println("hashmap entry 2: " + hash.getData("5"));
		// adding simple value
		
		hash.add("49384589$#@%^&%dfGBNH", "testtest");
		System.out.println("hashmap entry 3: " + hash.getData("49384589$#@%^&%dfGBNH"));
		// adding complex value
		
		System.out.println("----------------------------------");
		System.out.println("             trial 2");
		System.out.println("----------------------------------");
		
		// sometimes the program dies here
		hash.add("49384589aGBNH", "yeah1");
		hash.add("49s%dfGBNH", "yeah2");
		hash.add("49384b&%dfGBNH", "yeah3");
		hash.add("49384w^&%dfGBNH", "yeah4");
		hash.add("4938458n%dfGBNH", "yeah5");
		hash.add("493845a&%dfGBNH", "yeah6");
		hash.add("4938c%^&%dfGBNH", "yeah7");
		System.out.println("hashmap entry 4: " + hash.getData("49384589aGBNH"));
		System.out.println("hashmap entry 5: " + hash.getData("49s%dfGBNH"));
		System.out.println("hashmap entry 6: " + hash.getData("49384b&%dfGBNH"));
		System.out.println("hashmap entry 7: " + hash.getData("49384w^&%dfGBNH"));
		System.out.println("hashmap entry 8: " + hash.getData("4938458n%dfGBNH"));
		System.out.println("hashmap entry 9: " + hash.getData("493845a&%dfGBNH"));
		System.out.println("hashmap entry 10: " + hash.getData("4938c%^&%dfGBNH"));
		
		System.out.println("----------------------------------");
		System.out.println("             trial 3");
		System.out.println("----------------------------------");
		
		hashmap<Integer, Integer> fibHash = new hashmap();
		fibHash.add(0, 1);
		fibHash.add(1, 1);
		
		// add the previous two numbers to get the next number.
		// keys are positions, values are # in the sequence.
		int position = 10;
		for(int i = 0; i < position; i++) {
			// this for loop will run [position] times.
			fibHash.add(fibHash.getKey(i) + 2, fibHash.getValue(i) + fibHash.getValue(i+1));
		}
		System.out.println("fibHash entry 0: key: 0, value: 1");
		System.out.println("fibHash entry 1: key: 1, value: 1");
		// these print statements will cap at fibHash.getData(position + 1);
		// for example, if position is 3, then the cap is fibHash.getData(4);
		//System.out.println("fibHash entry 1: " + fibHash.getData(2));
		//System.out.println("fibHash entry 2: " + fibHash.getData(3));
		//System.out.println("fibHash entry 3: " + fibHash.getData(4));   <-- limit
		//System.out.println("fibHash entry 4: " + fibHash.getData(5));   <-- code will break
		
		// alternatively, using a for loop instead of typing all the print statements out would be much
		// more efficient.  :/
		for(int i = 0; i < position; i++) {
			System.out.println("fibHash entry " + (i + 2) + ": " + fibHash.getData(i + 2));
		}
		System.out.println("----------------------------------");
		System.out.println("          end of program");
		System.out.println("----------------------------------");
	}
}