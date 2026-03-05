package practicing1;

import java.util.Scanner;

public class Task4 {
	public static boolean isPalindrom(String str) {
		String modified_string = str.toLowerCase();
		modified_string = modified_string.replace(" ", "");
		int len = modified_string.length();
		for(int i=0; i<len/2; i++) {
			if(modified_string.charAt(i) != modified_string.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.print(Task4.isPalindrom(str));
		scan.close();
	}
}
