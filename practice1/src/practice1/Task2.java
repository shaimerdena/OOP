package practice1;

import java.util.Scanner;

public class Task2 {
	public static void areaPerimeterDiagonal(int len) {
		System.out.println("Area: " + Math.pow(len, 2));
		System.out.println("Perimeter: " + len*4);
		System.out.println("Diagonal: " + len*Math.sqrt(2));
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Task2.areaPerimeterDiagonal(scan.nextInt());
		scan.close();
	}
}
