package project.convertmp4.pageObjects.homePage;

import java.util.List;

import org.openqa.selenium.By;

import project.convertmp4.loaders.MyDriver;
import project.convertmp4.playlist.FindingPlaylist;

public class Mp4HomePageActions {

	/*
	 * ACTIONS
	 */

	public void selectSearchText() {
		System.out.println("Nous sommes bien sur la page d'accueil du convertisseur Mp4.");
		// affectation de la playlist au convertisseur vidéo une par une
		FindingPlaylist playList = new FindingPlaylist();
		List<String> urlsYoutube = playList.getURLPlaylist();

		// vérification de de la playlist trouvée
		for (int i = 1; i < urlsYoutube.size(); i++) {

			System.out.println(urlsYoutube.get(i));

			MyDriver.driver.findElement(By.id(Mp4HomePageIDs.SEARCH_TEXT)).sendKeys(urlsYoutube.get(i));
		}

		// MyDriver.driver.findElement(By.id(Mp4HomePageIDs.SEARCH_TEXT)).sendKeys(Mp4HomePageIDs.MP4_FILE_URL);

		MyDriver.driver.findElement(By.id(Mp4HomePageIDs.SEARCH_BUTTON)).click();
	}

//	 
	/*
	 * CHECKS
	 */
}
