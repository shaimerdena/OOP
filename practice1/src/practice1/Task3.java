package practice1;

import java.util.Scanner;

public class Task3 {
	public static String grading(float num) {
	    if (num < 0 || num > 100) {
			return "Invalid score";
		}
	    if (num < 49.5) {
			return "F";
		}
	    if (num < 54.5) {
			return "D";
		}
	    if (num < 59.5) {
			return "D+";
		}
	    if (num < 64.5) {
			return "C-";
		}
	    if (num < 69.5) {
			return "C";
		}
	    if (num < 74.5) {
			return "C+";
		}
	    if (num < 79.5) {
			return "B-";
		}
	    if (num < 84.5) {
			return "B";
		}
	    if (num < 89.5) {
			return "B+";
		}
	    if (num < 94.5) {
			return "A-";
		}
	    return "A";
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(grading(scan.nextFloat()));
		scan.close();
	}
}
