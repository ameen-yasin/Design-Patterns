package singleton;

public class MusicStreaming {
	private String user;
	private String song;

	public MusicStreaming(String user) {
		this.user = user;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public void listenSong(String song) {
		setSong(song);
		MusicHistory.getInstance().addSong(song);
	}
}
