package project.convertmp4.pageObjects.downloadPage;

import org.openqa.selenium.By;

import project.convertmp4.loaders.MyDriver;

public class Mp4DownloadPageActions {

	/*
	 * ACTIONS
	 */

	public void selectDownloadButton() {
		System.out.println("Nous sommes bien sur la page de téléchargement.");

		// recherche du 1er bouton de téléchargement
		MyDriver.driver.findElements(By.cssSelector(Mp4DownloadPageIDs.DOWNLOAD_BUTTON)).get(1).click();
		// recherche du bouton de téléchargement direct mp4
		MyDriver.driver.findElement(By.xpath(Mp4DownloadPageIDs.MODAL_DOWNLOAD_BUTTON)).click();
		System.out.println("Téléchargement en cours.");

		// test bouton Close de la fenêtre Modal
		MyDriver.driver.findElements(By.cssSelector(Mp4DownloadPageIDs.CLOSE_BUTTON)).get(0).click();
		System.out.println("Téléchargement réussi.");
	}

	/*
	 * CHECKS
	 */
}
