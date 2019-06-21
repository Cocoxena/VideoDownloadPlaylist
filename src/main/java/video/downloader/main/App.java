package video.downloader.main;

import java.util.List;

import video.downloader.download.DownloadFlow;
import video.downloader.url.finder.PlaylistFinder;

public class App {

	private static final String URL_PLAYLIST = "";

	public static void main(String[] args) {

		// 1. Recuperation des URLs des videos de la liste choisie
		List<String> allURLs;

		// 1.1. Appeler la class Recuperation URL
		PlaylistFinder finder = new PlaylistFinder();
		allURLs = finder.getYoutubeURLPlaylist(URL_PLAYLIST);

		// 2. Telechargement des videos de la liste

		// instanciation de la classe UploadingFlow
		DownloadFlow downloadFlow = new DownloadFlow();
		// lancement de la méthode run()
		downloadFlow.download(allURLs);

	}
}
