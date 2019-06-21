package video.downloader.url.finder;

import java.util.List;

import video.downloader.url.finder.youtube.playlist.YoutubePage;

public class PlaylistFinder {

	public PlaylistFinder() {
		super();
	}

	public List<String> getYoutubeURLPlaylist(String urlPlaylist) {
		return YoutubePage.findURLs(urlPlaylist);
	}

}
