package practicing1;

import java.util.Scanner;

public class Task3 {
	public static void calculatingR(float num, float per) {
		System.out.print("New balance: "+ (num + num * per/100));
	}
	
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		float number = scan.nextFloat();
		float percent = scan.nextFloat();
		scan.close();
		Task3.calculatingR(number, percent);
	}
}
