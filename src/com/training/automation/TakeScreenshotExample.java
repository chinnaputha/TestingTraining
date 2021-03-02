package com.training.automation;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/**
 * Class to Takesscreenshot using getoutput method from Takessceenshot interface
 * 
 * @author Chinna.Putha
 *
 */
public class TakeScreenshotExample extends TestBaseUtil {

	/**
	 * Method to capture screenshot
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void captureScreenshot() throws InterruptedException, IOException {
		lanuchApplication("https://www.gmail.com/");
		
		
		//Converting webdriver object into Takescreenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		//caputure the screenshot
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		//move the captured screenshot into destination folder path
		File destFile = new File("screenshots\\image_"+ getTodaysDate() + ".png");
		//File destFile = new File("screenshots\\"+this.getClass().getSimpleName() + getTodaysDate() + ".png");
		FileUtils.copyFile(srcFile, destFile);

		Thread.sleep(4000);

		closeBrowser();

	}
	
	/**
	 * Method to get today date and time
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

	public static void main(String[] args) throws Exception {
		TakeScreenshotExample ace = new TakeScreenshotExample();
		ace.captureScreenshot();
	}

}
