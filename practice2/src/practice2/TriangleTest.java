package practice2;

import java.util.Scanner;

public class TriangleTest {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		StarTriangle triangle = new StarTriangle(scan.nextInt(), scan.next());
		System.out.print(triangle);
		scan.close();
//		triangle.setSymbol("*");
//		System.out.print(triangle);
	}
}
