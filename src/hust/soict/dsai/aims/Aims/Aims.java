package hust.soict.dsai.aims.Aims;

import java.util.Scanner;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.store.Store;

public class Aims {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("Harry Potter", "Fantasy", 11.95f);
		book1.addAuthor("J.K. Rowling");
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Star Wars", "Sci-fi", "George Lucas", 9.45f);
		
		CompactDisc cd1 = new CompactDisc("Suyt 1", "Ngot", 4.95f);
		Track track1 = new Track("01 Chuyen Do Dang");
		cd1.addTrack(track1);
		Track track2 = new Track("02 Mo Lam Ma");
		cd1.addTrack(track2);
		Track track3 = new Track("03 Hay La");
		cd1.addTrack(track3);
		Track track4 = new Track("04 Thap Huong 05 Hoa Vang");
		cd1.addTrack(track4);
		
		// Open new instance of store
		Store store = new Store();
		store.addMedia(book1);
		store.addMedia(dvd1);
		store.addMedia(cd1);
		
		
		// User interaction start here
		Cart cart = new Cart();
		Scanner input = new Scanner(System.in);
		int choice;
		
		while (true) {
			showMenu();
			choice = input.nextInt();
			
			if (choice == 0) break;
			else if (choice == 1) {
				processStore();
				break;
			} else if (choice == 2) {
				break;
			} else if (choice == 3) {
				break;
			}
			
		}		
	}
	
	static void clear() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	
	
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}

	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
	
	public static void processStore() {
		Store.viewStore();			// View the list of available items in the store
		Aims.storeMenu(); 		// Show the interaction menu of the store
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		// Use case for each choice in the store menu:
		if (choice == 1) Store.processMediaDetails();
		if (choice == 2) Store.processaddCart();
		if (choice == 3) Store.processPlay();
		
	}
	
	

}
