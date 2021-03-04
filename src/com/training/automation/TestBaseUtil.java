package com.training.automation;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseUtil {

	public static WebDriver driver;

	public static void lanuchApplication(String appURL) {

		// set the chromedriver.exe path to launch chrome browser
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");// driver
		// open the chrome browser

		driver = new ChromeDriver();
		// ChromeDriver driver = new ChromeDriver();
		// open the application url in browser
		driver.get(appURL);
		// driver.navigate().to(appURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	/**
	 * Method to get today date and time
	 * 
	 * @return
	 */
	public String getTodaysDate() {
		DateFormat dateFormat = new SimpleDateFormat("M_d_yyyy_h_mm_ss");
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		String todaysdate = dateFormat.format(date);
		System.out.println("Today's Date:" + todaysdate);
		return todaysdate;
	}

	public void captureScreenshot() throws InterruptedException, IOException {

		// Converting webdriver object into Takescreenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		// caputure the screenshot
		File srcFile = ts.getScreenshotAs(OutputType.FILE);

		// move the captured screenshot into destination folder path
		File destFile = new File("screenshots\\image_" + getTodaysDate() + ".png");
		// File destFile = new File("screenshots\\"+this.getClass().getSimpleName() +
		// getTodaysDate() + ".png");
		FileUtils.copyFile(srcFile, destFile);

	}

	public static void closeBrowser() {
		driver.close();
	}

}
