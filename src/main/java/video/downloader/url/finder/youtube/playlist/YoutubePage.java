package video.downloader.url.finder.youtube.playlist;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import video.downloader.loaders.MyDriver;

public class YoutubePage {

	public static List<String> findURLs(String urlPlaylist) {
		List<String> playlist = new ArrayList<>();

		// Get URL
		MyDriver.driver.findElements(By.cssSelector("#index")).get(0);
		String url;

		int n = 9;
		for (int i = 1; i < n; i = +2) {

			MyDriver.driver.findElements(By.cssSelector("#index")).get(i + 1);

			url = MyDriver.driver.getCurrentUrl();

			playlist.add(url);

			System.out.println("c'est url " + url);

			MyDriver.driver.findElements(By.cssSelector(
					"#movie_player > div.ytp-chrome-bottom > div.ytp-chrome-controls > div.ytp-left-controls > a.ytp-next-button.ytp-button"))
					.get(0).click();
		}

		return playlist;

	}
}
