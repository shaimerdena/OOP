package data_analyzer;

import java.util.Scanner;

public class Analyzer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Data d = new Data();
		
		while(true) {
			System.out.print("Enter number (Q to quit): ");
			String input = scan.nextLine();
			
			if(input.equals("Q")) {
				break;
			}
			try {
				double number = Double.parseDouble(input);
				d.addValue(number);
			}
			catch (Exception e) {
				System.out.println("Invalid input.");
			}
		}
		
		d.printStatistics();
		
		scan.close();
	}
}	
