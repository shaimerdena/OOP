package pr5.io.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import pr5.io.model.Book;

public class BookTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		Path filePath = Paths.get("library.dat");
		String absPath = filePath.toAbsolutePath().toString();
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(absPath));
			books = (ArrayList<Book>) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
            books = new ArrayList<>();

        } catch (IOException | ClassNotFoundException e) {
            books = new ArrayList<>();
        }

		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("To add a book to the list type: A");
			System.out.println("To list the books type: L");
			System.out.println("To quit the library type: Q");
			String command = scan.nextLine();
			if(command.equals("Q")) {
				ObjectOutputStream oos;
				try {
					oos = new ObjectOutputStream(new FileOutputStream(absPath));
					oos.writeObject(books);
					oos.close();
				} catch (FileNotFoundException e) {
					System.out.println("Something went wrong.");
				} catch (IOException e) {
					System.out.println("Save failed.");
				}
				scan.close();
				break;
			} 
			else if(command.equals("A")) {
				System.out.println("Title: ");
				String title = scan.nextLine();
				
				System.out.println("Author: ");
				String author = scan.nextLine();
				
				Book b = new Book(title, author);
				books.add(b);
			} 
			else if(command.equals("L")) {
				for(Book b: books) {
					b.incrementVisitCount();
					System.out.println(b);
				}
			}
		}
	}
}
