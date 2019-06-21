package video.downloader.download.sconverter;

import org.openqa.selenium.By;

import video.downloader.loaders.MyDriver;

public class SconverterPageModalActions {

	/*
	 * ACTIONS
	 */

	public void selectDownloadButton() {
		System.out.println("Nous sommes bien sur la page de téléchargement.");

		// recherche du 1er bouton de téléchargement
		MyDriver.driver.findElements(By.cssSelector(SconverterPageModalIDs.DOWNLOAD_BUTTON)).get(1).click();
		// recherche du bouton de téléchargement direct mp4
		MyDriver.driver.findElement(By.xpath(SconverterPageModalIDs.MODAL_DOWNLOAD_BUTTON)).click();
		System.out.println("Téléchargement en cours.");

		// test bouton Close de la fenêtre Modal
		MyDriver.driver.findElements(By.cssSelector(SconverterPageModalIDs.CLOSE_BUTTON)).get(0).click();
		System.out.println("Téléchargement réussi.");
	}

	/*
	 * CHECKS
	 */
}
