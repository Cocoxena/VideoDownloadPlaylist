package video.downloader.download.sconverter;

public class SconverterHomePage {

	public SconverterHomePage() {
		super();
		System.out.println("A new mp4Homepage was opened.");
	}

	public void downloadThisVideo(String url) {
		// waitForThePage(); // we run the parent class method if we add a parameter

		performActions(url);
	}

	public void performActions(String url) {
		SconverterHomePageActions actions = new SconverterHomePageActions();

		actions.setSearchText(url);
	}

}
