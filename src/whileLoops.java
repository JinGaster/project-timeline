
public class whileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean variable1 = true;
		int A = 0;
		while(variable1) {
			System.out.println(A);
			A++;
			if(A == 100000) {
				variable1 = false;
			}
		}
	}

}
