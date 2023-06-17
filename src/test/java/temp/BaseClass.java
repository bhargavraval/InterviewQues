package temp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	WebDriver driver;

	BaseClass() {
		driver = new FirefoxDriver();
	}

}
