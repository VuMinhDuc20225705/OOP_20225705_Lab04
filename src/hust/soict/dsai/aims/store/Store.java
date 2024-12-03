package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import java.util.Scanner;
import hust.soict.dsai.aims.Aims.Aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Disc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.media.Track;

public class Store {
	public static ArrayList<Media> itemsInStore = new ArrayList<Media>();
	
	public void addMedia(Media item) {
		itemsInStore.add(item);
	}
	
	public void removeMedia(Media item) {
		int L = itemsInStore.size();
		int pos = 0;
		for (int i = 0; i < L; i++) {
			if (itemsInStore.get(i) == item) {
				pos = i;
				break;
			}
		}
		itemsInStore.remove(pos);
	}
	
	static int i = 0;
	static String type;
	
	public static void viewStore() {
		System.out.println("--------------------------------");
		for (Media ptr : itemsInStore) {
			i++;
			if (ptr instanceof DigitalVideoDisc) type = "DVD";
			if (ptr instanceof CompactDisc) type = "CD";
			if (ptr instanceof Book) type = "Book";
			System.out.println(i + " - " + type + " - " + ptr.getTitle() + " - " + ptr.getCategory() + " - " + ptr.getCost());
		}
		System.out.println("--------------------------------");
	}
	
	
	
	public static void processMediaDetails() {
		
		// Show details of each item in the store
		for (Media ptr : itemsInStore) {
			if (ptr instanceof DigitalVideoDisc) {
				System.out.println("------------------------------");
				System.out.println("Title: " + ptr.getTitle());
				System.out.println("Category: " + ptr.getCategory());
				System.out.println("Director: " + ((DigitalVideoDisc) ptr).getDirector());
				System.out.println("Length: " + ((DigitalVideoDisc) ptr).getLength());
				System.out.println("Cost: " + ptr.getCost());
				System.out.println("------------------------------");
			}
			
			if (ptr instanceof Book) {
				System.out.println("------------------------------");
				System.out.println("Title: " + ptr.getTitle());
				System.out.println("Category: " + ptr.getCategory());
				System.out.println("Authors: " + ((Book) ptr).getAuthors());
				System.out.println("Cost: " + ptr.getCost());
				System.out.println("------------------------------");
			}
			
			if (ptr instanceof CompactDisc) {
				System.out.println("------------------------------");
				System.out.println("Title: " + ptr.getTitle());
				System.out.println("Category: " + ptr.getCategory());
				System.out.println("Artists: " + ((CompactDisc) ptr).getArtist());
				for (Track tr : ((CompactDisc) ptr).getTracks()) {
					System.out.print(tr.getTitle() + ", ");
				}
				System.out.println();
				System.out.println("Cost: " + ptr.getCost());
			}
		}
	}
	
	public static void processaddCart() {
		System.out.println("Enter name of item to add: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		for (Media ptr : itemsInStore) {
			if (ptr.getTitle() == name) Cart.addMedia(ptr);
		}
	}
	
	public static void processPlay() {
		System.out.println("Enter name of item to play: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		for (Media ptr : itemsInStore) {
			if (ptr.getTitle() == name) 
				if (ptr instanceof DigitalVideoDisc) ((DigitalVideoDisc) ptr).play();
				if (ptr instanceof CompactDisc) ((CompactDisc) ptr).play();
		}
	}
	
	
	
	
	
}
