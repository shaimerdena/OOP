package practice1;

import java.util.Scanner;

public class Task4 {
	public static void function(int a, int b, int c) {
		final int D = b*b - 4 * a * c;
		if(D < 0) {
			System.out.print("error, try again.");
		}
		else if(D == 0) {
			System.out.print("x: "+(-b)/(2*a));
		}
		else {
			System.out.println("x1: "+(-b + Math.sqrt(D))/(2*a));
			System.out.println("x2: "+(-b - Math.sqrt(D))/(2*a));
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		Task4.function(a, b, c);
	}
}