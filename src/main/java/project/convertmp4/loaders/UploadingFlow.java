package project.convertmp4.loaders;

import project.convertmp4.YoutubePlaylist.page.Mp4YouTubePlaylistPage;
import project.convertmp4.constants.convertmp4Constants;
import project.convertmp4.pageObjects.downloadPage.Mp4DownloadPage;
import project.convertmp4.pageObjects.homePage.Mp4HomePage;

public class UploadingFlow {

	public UploadingFlow() {
		super();
		new MyDriver();
		// le Driver prend l'URL de la playlist
		MyDriver.driver.get(convertmp4Constants.YOUTUBE_PLAYLIST_URL);
		// le Driver prend la valeur de l'URL du site choisi
		// MyDriver.driver.get(convertmp4Constants.CONVERT_MP4_HOME_PAGE);

	}

	// instanciation des méthodes
	public void downloadingRun() {
		playlistRun();
		downloadingHomePageRun();
		downloadPageRun();

//		FindingPlaylist o = new FindingPlaylist();
//		List<String> urlsYoutube = o.getURLPlaylist();
//
//		// vérification de de la playlist trouvée
//		for (int i = 1; i < urlsYoutube.size(); i++) {
//
//			System.out.println("URL Youtube" + urlsYoutube);
//		}
//		downloadThisVideo();
	}

	// instanciation de la méthode run() de la playlist de la page YouTube
	protected void playlistRun() {
		Mp4YouTubePlaylistPage playlistPage = new Mp4YouTubePlaylistPage();
		playlistPage.run();
	}

	// instanciation de la méthode run() de la page d'accueil
	protected void downloadingHomePageRun() {
		Mp4HomePage homePage = new Mp4HomePage();
		homePage.run();
	}

	// instanciation de la méthode run() de la page de téléchargement
	protected void downloadPageRun() {
		Mp4DownloadPage page = new Mp4DownloadPage();
		page.run();
	}

//	protected void downloadThisVideo() { 
//		downloadingHomePageRun();
//		downloadPageRun();
//
//	}
}
