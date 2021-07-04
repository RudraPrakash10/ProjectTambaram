package org.utilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static void applywaitToAllLocators() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void type(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void btnClick(WebElement e) {
		e.click();
	}

	public static void getTittle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void getUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void quitBrowser() {
		driver.quit();
	}

	public static void selectByVisibleText(WebElement element, String text) {

		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void takeSnap(String filename) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"C:\\Users\\RUDRA\\eclipse-workspace\\CucumberPom\\src\\test\\resources\\Reports\\Screenshots\\"
						+ filename + ".png");
		FileUtils.copyFile(src, dest);

	}
}
