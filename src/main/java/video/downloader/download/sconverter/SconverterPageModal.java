package video.downloader.download.sconverter;

public class SconverterPageModal {

	public SconverterPageModal() {
		super();
		System.out.println("A new download page was opened.");
	}

	public void run() {
		// waitForThePage(); // we run the parent class method if we add a parameter

		performActions();
	}

	public void performActions() {
		SconverterPageModalActions actions = new SconverterPageModalActions();

		actions.selectDownloadButton();
	}

}
