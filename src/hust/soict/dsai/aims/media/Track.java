package hust.soict.dsai.aims.media;

public class Track implements Playable{
	private String title;
	private int length;
	
	
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	
	public Track(String title) {
		this.title = title;
	}
	
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}

}
