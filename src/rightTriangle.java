
public class rightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x = 11; x > 0; x--) {
			for(int y = 0; y < x; y++) {
				System.out.print(" ");
			}
			for(int z = 0; z < (12-x); z++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}

}
