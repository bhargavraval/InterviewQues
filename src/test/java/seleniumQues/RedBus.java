package seleniumQues;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class RedBus {
	WebDriver driver;

	@Test
	public void searchSourceLocation() {
		try {
			FirefoxOptions ffoptions = new FirefoxOptions();
			ffoptions.addArguments("-headless");
			driver = new FirefoxDriver(ffoptions);
			driver.get("https://www.redbus.com/");
			driver.manage().window().maximize();
			if (driver.findElement(By.xpath("//button[text()='Accept All']")).isDisplayed()) {
				driver.findElement(By.xpath("//button[text()='Accept All']")).click();
			}
			driver.findElement(By.xpath("//input[@id='src'][1]")).sendKeys("Ban");
			Thread.sleep(10000);
//            System.out.println(driver.findElement(By.xpath("//div[contains(@class,'autoFill')]")).getText());
			System.out.println(driver.findElements(By.xpath("//div[contains(@class,'autoFill')]/li")).size());
			List<WebElement> elements = driver.findElement(By.xpath("//div[contains(@class,'autoFill')]/li/div"))
					.findElements(By.xpath("./*"));
			for (WebElement element : elements) {
				System.out.println("this is text" + element.getText());
				System.out.println("tagname>>>>>>>>>>" + element.getTagName());
				System.out.println("--------");
			}
			driver.findElement(By.xpath(
					"//div[contains(@class,'autoFill')]/li/div/li[text()='Majestic, Bangalore, Karnataka, India']"))
					.click();
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}

	}

}
