
public class recursion {
	public void forLoop(int start, int end, int increasingBy) {
		if(start == end) {
			System.out.println(start);
		}
		else {
			System.out.println(start);
			forLoop(start + increasingBy, end, increasingBy);
		}
	}
	
	public int recursiveFactorial(int number) {
		if(number == 1) {
			return 1;
		}
		else if(number == 0) {
			return 1;
		}
		else {
			return number * recursiveFactorial(number - 1);
		}
	}
	
	public int recursiveExponential(int number, int power) {
		if(power == 0) {
			return 1;
		}
		else if(power == 1) {
			return number;
		}
		else {
			if(power == 0) {
				return number;
			}
			else {
				return number * recursiveExponential(number, power - 1);
			}
		}
	}
	
	public int recursiveFibbonaci(int position) {
		if(position == 1 || position == 2) {
			return 1;
		}
		else {
			return recursiveFibbonaci(position - 2) + recursiveFibbonaci(position - 1);
		}
	}
	
	public int recursiveTowers(int disks) {
		//System.out.print("Least # of moves required: ");
		if(disks == 3) {
			//print instructions on how to do 3 disks
			return 7;
		}
		else {
			//print instructions for 3, then 4, 3, 5, 3, 4, 3, 6, etc.
			return recursiveTowers(disks - 1) + 1 + recursiveTowers(disks - 1);
		}
	}
}
