package singleton;

public class MusicDriver {
	public static void main(String[] args) {
		MusicStreaming playList = new MusicStreaming("Ameen");
		playList.listenSong("Jonas Blue - Perfect Strangers ft. JP Cooper");
		System.out.println("Recntly Played" + playList.getSong());

//		String historyOfAmeen = MusicHistory.getInstance().showHistory();
//		System.out.println(historyOfAmeen);
//		System.out.println(MusicHistory.getInstance().showHistory());

		MusicStreaming DailyList = new MusicStreaming("ROOT");
		DailyList.listenSong("The Chainsmokers - Closer ft. Halsey ");
		DailyList.listenSong("Halsey - Without Me");
		String historyOfROOT = MusicHistory.getInstance().showHistory();
		System.out.println(historyOfROOT);

	}
}
