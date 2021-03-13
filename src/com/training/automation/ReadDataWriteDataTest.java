package com.training.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

import com.training.objectmap.IAutoPractObjMap;

public class ReadDataWriteDataTest extends TestBaseUtil {

	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	File file;
	FileInputStream fis;
	String username;
	String password;
	WebDriverWait wait;

	@org.testng.annotations.Test
	public void readData() throws Exception {

		lanuchApplication("http://automationpractice.com/index.php");

		try {
			// Find the file path
			file = new File("xlsx\\login.xlsx");
			// read the file
			fis = new FileInputStream(file);
			// convert file into workbook
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheetAt(0);
			row = sheet.getRow(1);
			System.out.println("total rows in sheet" + sheet.getPhysicalNumberOfRows());
			System.out.println("total cells in a row -->" + row.getLastCellNum());// 3
			XSSFCell cell1 = row.getCell(0);
			XSSFCell cell2 = row.getCell(1);
			XSSFCell cell3 = row.getCell(2);

			System.out.println("Cell1 values -->" + cell1.toString());
			System.out.println("Cell2 values -->" + cell2.toString());
			System.out.println("Cell3 values -->" + cell3.toString());
			username = cell1.toString();
			password = cell2.toString();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("file not in read mode");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// close the workbook
			// wb.close();
			// close the file
			fis.close();
		}

		driver.findElement(By.cssSelector(IAutoPractObjMap.AP_SIGNIN_CSS)).click();

		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(IAutoPractObjMap.AP_USERNAME_CSS)));
		System.out.println("username from xlsx -->" + username);
		System.out.println("password from xlsx -->" + password);
		driver.findElement(By.cssSelector(IAutoPractObjMap.AP_USERNAME_CSS)).sendKeys(username);
		driver.findElement(By.cssSelector(IAutoPractObjMap.AP_PASSWORD_CSS)).sendKeys(password);
		Thread.sleep(6000);

		// create cell value in row1 and cell3
		row.createCell(3).setCellValue("SKIP");
		row.createCell(4).setCellValue("writing data to the workbook sheet");
		// write the data into the workbook
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);

		wb.close();// closing the workbook
		fos.close();// close file write mode also

	}

	@AfterClass
	public void closeBrow() {
		driver.quit();
	}

}
