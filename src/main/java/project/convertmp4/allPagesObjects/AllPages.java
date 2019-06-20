package project.convertmp4.allPagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import project.convertmp4.loaders.MyDriver;

//import tuto.eclipse.jal.selenium.loaders.BookingFlow;
//import tuto.eclipse.jal.selenium.loaders.MyDriver;

public class AllPages {

	public AllPages() {
		super();
	}

	public void waitForThePageByElementID(String id) {
		WebDriverWait wait = new WebDriverWait(MyDriver.driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
	}

}
