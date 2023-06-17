package temp;

import org.openqa.selenium.WebDriver;

public class PageClass {

	WebDriver driver;

	PageClass(WebDriver driver) {
		this.driver = driver;
	}

	public void getDriver() {
		System.out.println(driver);
	}

}
