package project.convertmp4.playlist;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import project.convertmp4.loaders.MyDriver;

public class FindingPlaylist {

//	public void setPlaylist(List<String> playlist) {
//		this.playlist = playlist;
//	}

	public FindingPlaylist() {

		super();

	}

//	public List<String> getPlaylist() {
//		return playlist;
//	}

	public List<String> getURLPlaylist() {
		List<String> playlist = new ArrayList<String>();

		// Get URL
		MyDriver.driver.findElements(By.cssSelector("#index")).get(0);
		String URL;

		int n = 9;
		for (int i = 1; i < n; i = +2) {

			MyDriver.driver.findElements(By.cssSelector("#index")).get(i + 1);

			URL = MyDriver.driver.getCurrentUrl();

			// playListHS.add(URL.trim());

			playlist.add(URL);

			System.out.println("c'est url " + URL);

			// button back de youtube

			MyDriver.driver.findElements(By.cssSelector(
					"#movie_player > div.ytp-chrome-bottom > div.ytp-chrome-controls > div.ytp-left-controls > a.ytp-next-button.ytp-button"))
					.get(0).click();

			// (By.className("ytp-next-button ytp-button")).click();

//            System.out.println( "c'est url "+ URL);

//            playlist.add(URL);

		}

//		for (String url : playlist) {
//			System.out.println("c'est l'URL " + url);
//
//		} 

		return playlist;

	}

}
