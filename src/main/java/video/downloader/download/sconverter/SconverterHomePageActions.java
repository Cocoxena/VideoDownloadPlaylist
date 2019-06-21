package video.downloader.download.sconverter;

import org.openqa.selenium.By;

import video.downloader.loaders.MyDriver;

public class SconverterHomePageActions {

	/*
	 * ACTIONS
	 */

	public void setSearchText(String url) {

		// vérification de de la playlist trouvée
//		for (int i = 1; i < urlsYoutube.size(); i++) {
//			System.out.println(urlsYoutube.get(i));
//			MyDriver.driver.findElement(By.id(SconverterHomePageIDs.SEARCH_TEXT)).sendKeys(urlsYoutube.get(i));
//		}

		MyDriver.driver.findElement(By.id(SconverterHomePageIDs.SEARCH_BUTTON)).click();
	}

//	 
	/*
	 * CHECKS
	 */
}
