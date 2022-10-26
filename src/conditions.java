
public class conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int variable1 = 2;
		if(variable1 == 4) {
			System.out.println(variable1);
		}
		else if(variable1 <= 4) {
			System.out.println("It's less than 4.");
		}
		else if(variable1 >= 4) {
			System.out.println("It's greater than 4.");
		}
		// else {
			System.out.println(variable1);
		// }
		String variable2 = "street";
//		String variable3 = "Street";
		if(variable2.equalsIgnoreCase("STREET")) {
			System.out.println(variable2);
		}
//		else {
//			System.out.println(variable2);
//		}
//		if(variable3.equals("street")) {
//			System.out.println(variable3);
//		}
//		else {
//			System.out.println(variable3);
//		}
	}

}
