package project.convertmp4.pageObjects.downloadPage;

import project.convertmp4.allPagesObjects.AllPages;

public class Mp4DownloadPage extends AllPages {

	public Mp4DownloadPage() {
		super();
		System.out.println("A new download page was opened.");
	}

	public void run() {
		// waitForThePage(); // we run the parent class method if we add a parameter

		performActions();
	}
//
//	public void waitForThePage() {
//		Mp4HomePageChecks check = new Mp4HomePageChecks();
//		//check.waitForThePage();
//		System.out.println("The Home Page has been loaded");
//	} 

	public void performActions() {
		Mp4DownloadPageActions actions = new Mp4DownloadPageActions();

		actions.selectDownloadButton();
	}

}
