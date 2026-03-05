package practicing1;

import java.util.Scanner;

public class Task2 {
	public static void calculating(double r) {
		if(r <= 0) {
			System.out.print("error");
			return;
		}
		System.out.println("Area: " + Math.PI * r * r);
		System.out.println("Diameter: "+ 2*r);
		System.out.println("Length: "+ 2*Math.PI*r);
	}	
	
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Task2.calculating(scan.nextDouble());
		scan.close();
	}
}
