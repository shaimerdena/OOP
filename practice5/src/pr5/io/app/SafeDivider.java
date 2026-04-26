package pr5.io.app;

import java.util.Scanner;

public class SafeDivider {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			try{
				int x1 = Integer.parseInt(scan.nextLine());
				int x2 = Integer.parseInt(scan.nextLine());
				
				int div = x1/x2;
				
				System.out.println("The result of division: " + div);
			
				break;
			} catch (ArithmeticException e) {
				System.out.println("Error: сannot divide by zero. try again.");
			} catch (NumberFormatException e) {
				System.out.println("Error: enter numbers. try again.");
			} catch (Exception e) {
				System.out.println("Eror: something went wrong.");
			}
		}
		scan.close();
	}
}
