
public class equilateralTriangle {

	public static void main(String[] args) {
		// prints an equilateral triangle
		// TODO Auto-generated method stub
		//		for(int a = 0; a < 10; a++) {
		//			for(int x = 9; x > a; x--) {
		//				System.out.print(" ");
		//			}
		//			for(int z = 0; z < a; z++) {
		//			System.out.print("X");
		//	}
		//			for(int b = 1;b < a; b++) {
		//				System.out.print("X");
		//			}
		//			for(int y = 9; y > a; y--) {
		//				System.out.print(" ");
		//			}
		//			System.out.println();
		//			}
		for(int z = 0; z < 15; z++) {
			for(int y = 0; y < z; y++) {
				System.out.print(" ");
			}
			for(int x = 0; x < (15-z); x++) {
				System.out.print("X");
			}
			for(int a = 15; a > z; a--) {
				System.out.print("X");
			}
			System.out.println();
		}
	}

}
