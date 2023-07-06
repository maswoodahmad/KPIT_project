package baisc;

import java.util.Scanner;

public class MenuTest2 {
	public static void main(String[] args) {
		
	int choice;
	
	do {
		System.out.println("M E N U");
		System.out.println("-------------");
		System.out.println("1. Search");
		System.out.println("2. Sort");
		System.out.println("3. Insert");
		System.out.println("4. Update");
		System.out.println("5. Delete");
		System.out.println("-------------");
		System.out.println("6. Exit");
		System.out.println("-------------");
		
		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();

		switch (choice) {
			case 11, 12, 13, 14, 15 -> System.out.println("Searching....");
			case 2 -> System.out.println("Sorting....");
			case 3 -> System.out.println("Inserting....");
			case 4 -> System.out.println("Updating....");
			case 5 -> System.out.println("Deleting....");
			case 6 -> System.out.println("Exiting....");
			default -> System.out.println("Invalid Choice....");
		}
	} while(choice!=6);
		System.out.println("END of MAIN");
	}
}