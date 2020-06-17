package singleton;

import java.util.Calendar;

public class MusicHistory {
	private static MusicHistory instance;
	private String song;

	private MusicHistory() {
		this.song = "";
	}

	public static MusicHistory getInstance() {
		if (instance == null)
			instance = new MusicHistory();
		return instance;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public void addSong(String song) {
		// Calendar is another example of singelton design pattern
		// since Date Class is deprecated
		Calendar date = Calendar.getInstance();
		this.song = getSong() + song + " -> " + date.getTime() + "\n";
	}

	public String showHistory() {
		return song;
	}
}
