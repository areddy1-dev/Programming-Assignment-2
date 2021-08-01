import java.util.Scanner;

public class Figures {
	static void printBox(int size) {
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}

	static void printDiamond(int size) {
		
		for (int i = 1; i <= size / 2 + 1; i++)  // Upper half diamond
		{
			for (int j = 1; j <= (size / 2 + 1) - i; j++) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i; k++) 
			{
				if (k == 1 || k == 2 * i) 
				{
					System.out.print("X");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

		for (int i = 1; i <= size / 2; i++) {	// lower half diamond
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * (size / 2 - i) + 2; k++) {
				if (k == 1 || k == 2 * (size / 2 - i) + 2) 
				{
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printX(int size) {
		for (int i = 1; i <= size; i++) { 
			for (int j = 1; j <= size; j++) { 
				if (i == j || i + j == size + 1) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(); 
		}
	}

	public static void main(String[] args) {
		int size, option;

		Scanner scan = new Scanner(System.in);

		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Reddy Anand Kumar Reddy");
		System.out.println("PROGRAMMING ASSIGNMENT 2");
		System.out.println();
		System.out.print("Enter the size of the figure: "); // type an odd number

		size = scan.nextInt();

		while ((size % 2) == 0) {
			System.out.println("Invalid figure size - must be an odd number");
			System.out.println();
			System.out.print("Re-enter the size of the figure: ");
			size = scan.nextInt();
		}

		System.out.println("MENU: ");
		System.out.println("1. Print box" );
		System.out.println("2. Print diamond");
		System.out.println("3. Print X");
		System.out.println("4. Quit program");
		System.out.println();

		option = scan.nextInt();

		while (option != 4) {
			switch (option) {    // switch case for box, diamond, x
			case 1:
				System.out.println();
				printBox(size);
				System.out.println();
				break;
			case 2:
				System.out.println();
				printDiamond(size);
				System.out.println();
				break;
			case 3:
				System.out.println();
				printX(size);
				System.out.println();
				break;
			}
			System.out.println("MENU: ");
			System.out.println("1. Print box" );
			System.out.println("2. Print diamond");
			System.out.println("3. Print X");
			System.out.println("4. Quit program");
			System.out.println();
			System.out.print("Please select an option: ");

			option = scan.nextInt();	
		}
		System.out.println("Good bye!");

		scan.close();
	}

}