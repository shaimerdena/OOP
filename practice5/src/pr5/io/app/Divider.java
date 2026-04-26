package pr5.io.app;

import java.util.Scanner;

public class Divider {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		try {
			int div = num1/num2;
			System.out.print(div);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		scan.close();
	}

}
