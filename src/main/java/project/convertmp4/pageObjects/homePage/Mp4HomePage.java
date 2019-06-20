package project.convertmp4.pageObjects.homePage;

import project.convertmp4.allPagesObjects.AllPages;

public class Mp4HomePage extends AllPages {

	public Mp4HomePage() {
		super();
		System.out.println("A new mp4Homepage was opened.");
	}

	public void run() {
		// waitForThePage(); // we run the parent class method if we add a parameter

		performActions();
	}

	public void performActions() {
		Mp4HomePageActions actions = new Mp4HomePageActions();

		actions.selectSearchText();
	}

}
