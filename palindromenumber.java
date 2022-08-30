import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {

		while (true) {
			int n;
			System.out.print("Enter a 7-digit number (Write -1 to quit.) : ");
			Scanner scanner = new Scanner(System.in);

			n = scanner.nextInt();

			if (n == -1) {
				System.out.println("Program is terminating...");
				break;
			}

			else if (n <= 999999)
				System.out.println("Number must be 7 digits!");
			else if (n >= 10000000)
				System.out.println("Number must be 7 digits!");
			else {
				int dgt1, dgt2, dgt3, dgt4, dgt5, dgt6, dgt7;

				dgt1 = n / 1000000;
				n = n % 1000000;

				dgt2 = n / 100000;
				n = n % 100000;

				dgt3 = n / 10000;
				n = n % 10000;

				dgt4 = n / 1000;
				n = n % 1000;

				dgt5 = n / 100;
				n = n % 100;

				dgt6 = n / 10;
				n = n % 10;

				dgt7 = n;

				if (dgt1 == dgt7) {
					if (dgt2 == dgt6)
						if (dgt3 == dgt5)
							System.out.println("This number is palindrome.");
				} else {
					System.out.println("This number is not palindrome.");
				}
			}

		}
	}
}