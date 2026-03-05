package practicing1;

import java.util.Scanner;

public class Task1 {
	public static void frame(int num) {
		for(int i=0; i<num+2; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void nameWithFrame(String name) {
		int len = name.length();
		Task1.frame(len);
		System.out.println("*" + name + "*");
		Task1.frame(len);
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Task1.nameWithFrame(scan.nextLine());
		scan.close();
	}
}