package problem1.partb;

import java.util.Objects;

public class Book extends LibraryItem {
	private int numberOfPages;
	
	public Book(String title, String author, int year, int pages) {
		super(title, author, year);
		this.setNumberOfPages(pages);
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return super.toString() + "number of pages: " + this.getNumberOfPages() + "\n";
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Book)) return false;
		if(!super.equals(o)) return false;
		Book b = (Book) o;
		return Objects.equals(numberOfPages, b.numberOfPages);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), numberOfPages);
	}
}