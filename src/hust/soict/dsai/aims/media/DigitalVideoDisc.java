package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	
	private String director;
	private int length;

	public String getDirector() { 
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	private static int nbDigitalVideoDiscs = 0;
	public DigitalVideoDisc() {
		nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
    }

    // Create DVD object
	public DigitalVideoDisc(String title) {
		this.setTitle(title);
	}
	
	
	// Create new DigitalVideoDisc object with various parameters
	public DigitalVideoDisc(String category, String title, float cost) {
        this.setCategory(category);
        this.setTitle(title);
        this.setCost(cost);
    }
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.setDirector(director);
        this.setCategory(category);
        this.setTitle(title);
        this.setCost(cost);
    }
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this.setTitle(title);
		this.setCategory(category);
        this.setDirector(director);
        this.setLength(length);
        this.setCost(cost);
    }

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}
