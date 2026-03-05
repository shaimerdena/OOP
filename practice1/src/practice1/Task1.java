package practice1;

import java.util.Scanner;

/**
 * Naming Conventions:
 * classes - PascalCase
 * method / parameters - camelCase
 */

public class Task1 {  // Task1
	private static void line(int len) {
		System.out.print('+');
		for(int i=0; i<len; i++) {
			System.out.print('-');
		}
		System.out.println('+');
	}

	public static void printingName(String name) {
		int len = name.length();
		Task1.line(len);
		System.out.println('|' + name + '|');
		Task1.line(len);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Task1.printingName(scan.next());
		scan.close();
	}
}
