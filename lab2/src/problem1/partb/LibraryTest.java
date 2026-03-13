package problem1.partb;

import java.util.HashSet;

public class LibraryTest {
	public static void main(String[] args) {
		Book b1 = new Book("The count of Mount Cristo", "Alex Duma", 1845, 600);
		Book b2 = new Book("Three comrades", "Remark", 1932, 400);
		Book b3 = new Book("Three comrades", "Remark", 1932, 400);
		
		System.out.println(b3.equals(b2));
		System.out.println(b3.equals(b1));
		
		HashSet<Book> items = new HashSet<>();
		items.add(b1);
		items.add(b2);
		items.add(b3);	
		for(Book b: items) {
			System.out.print(b + "\n");
		}
	}
}
