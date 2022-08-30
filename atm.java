import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);

			double[] users = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
			int choice;
			int id;
			while (true) {
				System.out.print("Enter an id (0-9): ");
				id = scan.nextInt();

				if (id >= 0 && id <= 9) {

					while (true) {
						System.out.println("   ");
						System.out.println("Main Menu");
						System.out.println("1: Check Balance");
						System.out.println("2: Withdraw");
						System.out.println("3: Deposit");
						System.out.println("4: Exit");
						System.out.print("Enter a choice: ");

						choice = scan.nextInt();

						if (choice == 1) {
							checkBalance(id, users);

						} else if (choice == 2) {
							withDraw(id, users);

						} else if (choice == 3) {
							deposit(id, users);
						} else {
							break;
						}
					}

				} else {
					System.out.println("Invalid id!");
					System.out.println("  ");
					break;

				}
			}
		}
	}

	public static void checkBalance(int i, double[] array) {
		System.out.println("The balance is " + array[i]);
	}

	public static void withDraw(int i, double[] array) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an amount to withdraw: ");
		double amount_withdraw = scan.nextInt();
		if (amount_withdraw > 100) {
			System.out.println("Insufficient balance!");
		} else if (amount_withdraw < 0) {
			System.out.println("You cannot enter a negative value!");
		} else {
			double newBalance = array[i] - amount_withdraw;
			System.out.println("The operation is successful. Your new balance is " + newBalance);
			array[i] = newBalance;

		}

	}

	public static void deposit(int i, double[] array) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an amount to deposit: ");
		double amount_deposit = scan.nextInt();
		if (amount_deposit < 0) {
			System.out.println("You cannot enter a negative value!");
		} else {
			double newBalance = array[i] + amount_deposit;
			System.out.println("The operation is successful. Your new balance is " + newBalance);
			array[i] = newBalance;

		}
	}
}