package video.downloader.download;

import java.util.List;

import video.downloader.constants.Constants;
import video.downloader.download.sconverter.SconverterHomePage;
import video.downloader.download.sconverter.SconverterPageModal;
import video.downloader.loaders.MyDriver;

public class DownloadFlow {

	public DownloadFlow() {
		super();
		new MyDriver();
		// le Driver prend l'URL de la playlist
		// TODO MEttre dans le finder
		MyDriver.driver.get(Constants.YOUTUBE_PLAYLIST_URL);

	}

	// instanciation des méthodes
	public void download(List<String> allURLs) {
		downloadFromSconverter(allURLs);
	}

	// instanciation de la méthode run() de la page d'accueil
	protected void downloadFromSconverter(List<String> allURLs) {
		SconverterHomePage homePage = new SconverterHomePage();

		// TODO Utiliser les URLs
		homePage.downloadThisVideo("TODO");
		SconverterPageModal page = new SconverterPageModal();
		page.run();
	}

}
