
public class triangleFigures {

	public static void main(String[] args) {

		for (int row = 1; row < 11; row++) {			
			for (int clmn = 0; clmn < row; clmn++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println();
		
		for (int row = 0; row < 10; row++) {
			for (int clmn = 10; clmn > row; clmn--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println();
		
		for (int row = 0; row < 11; row++) {
			for (int clmn = 0; clmn < row; clmn++) {
				System.out.print(" ");
			}
			for (int clmn = 10; clmn > row; clmn--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	    
		for (int row = 1; row < 11; row++) {
			for (int clmn = 10; clmn > row; clmn--) {
				System.out.print(" ");
			}
			for (int clmn = 0; clmn < row; clmn++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}
