package hust.soict.dsai.aims.media;

public class Disc extends Media {
	private int length;
	private String director;
	
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	private static int nbDiscs = 0;
	public Disc() {
		nbDiscs++;
        this.setId(nbDiscs);
    }
	
	public Disc(String category, String title, float cost) {
        this.setCategory(category);
        this.setTitle(title);
        this.setCost(cost);
    }
	
	public Disc(String director, String category, String title, float cost) {
        this.setDirector(director);
        this.setCategory(category);
        this.setTitle(title);
        this.setCost(cost);
    }
	
	public Disc(String title, String category, String director, int length, float cost) {
		this.setTitle(title);
		this.setCategory(category);
        this.setDirector(director);
        this.setLength(length);
        this.setCost(cost);
    }
	public void play() {
		// TODO Auto-generated method stub
		
	}

}
