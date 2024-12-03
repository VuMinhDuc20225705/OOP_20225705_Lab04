package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class Book extends Media {
	private ArrayList<String> authors = new ArrayList<String>();
	private static int nbBook = 0;
	
	public Book() {
		nbBook++;
		this.setId(nbBook);
	}
	
	public ArrayList<String> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}

	public Book(String title, String category, float cost) {
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
	}

	public void addAuthor(String authorName) {
		int repeat = 0;
		for (int i = 0; i < authors.size(); i++) {
			String test = authors.get(i);
			if (authorName == test) repeat++;
		}
		if (repeat >= 1) System.out.println("Author already added!");
		else authors.add(authorName);
	}
	
	public void removeAuthor(String authorName) {
		int found = 0;
		int pos = 0;
		for (int i = 0; i < authors.size(); i++) {
			String test = authors.get(i);
			if (authorName == test) {
				found++;
				pos = i;
			}
		}
		if (found >= 1) System.out.println("Author not found!");
		else authors.remove(pos);
	}
	
}
