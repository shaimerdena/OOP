package problem1.partb;

import java.util.Objects;

public abstract class LibraryItem {
	private String title;
	private String author;
	private int publicationYear;
	
	public LibraryItem(String title, String author, int year) {
		this.setAuthor(title);
		this.setTitle(author);
		this.setPublicationYear(year);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	
	@Override
	public String toString() {
		return "title: " + this.getTitle() + "\n" +
				"author: " + this.getAuthor() + "\n" +
				"publication year: " + this.publicationYear + "\n";
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || !(o instanceof LibraryItem)) return false;
		LibraryItem item = (LibraryItem) o;
		return Objects.equals(title, item.title) &&
				Objects.equals(author, item.author) &&
				publicationYear == item.publicationYear;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(title, author, publicationYear);
	}
}
