package practice1;

import java.util.Scanner;

public class Task5 {
	public static void newBalance(float num, float percentage) { // X snake_case
		float new_bal = num + num * percentage/100;
		System.out.print(new_bal);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float balance = scan.nextFloat();
		float percentage = scan.nextFloat();
		scan.close();
		Task5.newBalance(balance, percentage);
	}
}