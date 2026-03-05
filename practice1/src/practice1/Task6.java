package practice1;

import java.util.Scanner;

public class Task6 {
	public static boolean palindromCheck(String word) {
		int len = word.length();

		int l = 0;
		int r = len - 1;
		while(l <= r) {
			if(word.charAt(l) != word.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(Task6.palindromCheck(scan.next()));
		scan.close();
	}
}