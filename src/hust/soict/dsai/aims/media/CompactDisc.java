package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	public String getArtist() {
		return artist;
	}
	
	public ArrayList<Track> getTracks() {
		return tracks;
	}

	public void setTracks(ArrayList<Track> tracks) {
		this.tracks = tracks;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public CompactDisc(String artist) {
		this.artist = artist;
	}
	
	public CompactDisc(String title, String artist, float cost) {
		this.setTitle(title);
		this.artist = artist;
		this.setCost(cost);
	}
	
	public void addTrack(Track trackName) {
		int repeat = 0;
		for (int i = 0; i < tracks.size(); i++) {
			Track test = tracks.get(i);
			if (test.getTitle() == trackName.getTitle()) repeat++;
		}
		if (repeat >= 1) System.out.println("Track already added!");
		else tracks.add(trackName);
	}
	
	public void removeTrack(Track trackName) {
		int found = 0;
		int pos = 0;
		for (int i = 0; i < tracks.size(); i++) {
			Track test = tracks.get(i);
			if (test.getTitle() == trackName.getTitle()) {
				found++;
				pos = i;
			}
		}
		if (found >= 1) System.out.println("Track not found!");
		else tracks.remove(pos);
	}
	
	public int getLength() {
		int total = 0;
		for (Track tr : tracks) {
			total = total + tr.getLength();
		}
		System.out.println("Total length: " + total);
		return 0;
		
	}
	

	@Override
	public void play() {
		// TODO Auto-generated method stub
		int index = 0;
		System.out.println(this.getTitle());
		for (int i = 0; i < tracks.size(); i++) {
			index++;
			System.out.println(index + ". " + tracks.get(i).getTitle() + "   " + "Length: " + tracks.get(i).getLength());
		}
	}
}
