package project.convertmp4.YoutubePlaylist.page;

import project.convertmp4.allPagesObjects.AllPages;

public class Mp4YouTubePlaylistPage extends AllPages {

	public Mp4YouTubePlaylistPage() {
		super();
		System.out.println("A new YouTube playlist page was opened.");
	}

	public void run() {
		// waitForThePage(); // we run the parent class method if we add a parameter

		performActions();
	}

	public void performActions() {
		Mp4YouTubePlaylistActions actions = new Mp4YouTubePlaylistActions();
		actions.selectPlayList();
	}

}
