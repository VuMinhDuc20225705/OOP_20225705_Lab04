package hust.soict.dsai.aims.cart;
//import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
//import hust.soict.dsai.aims.media.Track;

import java.util.ArrayList;

public class Cart {
	//public static final int MAX_NUMBERS_ORDERED = 20;
	//private static DigitalVideoDisc itemsOrdered[] =
	//		new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	//int qtyOrdered = itemsOrdered.length;
	
	public static ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public static void addMedia(Media item) {
		itemsOrdered.add(item);
	}
	
	public void removeMedia(Media item) {
		int L = itemsOrdered.size();
		int pos = 0;
		for (int i = 0; i < L; i++) {
			if (itemsOrdered.get(i) == item) {
				pos = i;
				break;
			}
		}
		itemsOrdered.remove(pos);
	}
	
	
	public float totalCost() {
		float cost = 0;
		for (Media ptr : itemsOrdered) {
			cost = cost + ptr.getCost();
		}
		return cost;
	}
	
	public void invoice() {
		int length = 0;
		for (Media ptr : itemsOrdered) {
			if (ptr != null) length++;
		}
		float total = 0;
		System.out.println("***********************CART***********************");
		System.out.println("Ordered items");
		
		for (int i = 0; i < length; i++) {
			System.out.println((i+1) + " - " + itemsOrdered.get(i).getTitle() 
									 + " - " + itemsOrdered.get(i).getCategory() +
									 //+ " - " + itemsOrdered.get(i).getDirector() 
									 //+ " - " + itemsOrdered.get(i).getLength() + 
									 " - " + itemsOrdered.get(i).getCost() +"$");
			total = total + itemsOrdered.get(i).getCost();
		}
		System.out.println("Total cost: " + total +"$");
		System.out.println("***************************************************");
		
	}
}
