package org.bookswagon.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public File file_Location;
	public Workbook workbook;
	public Sheet sheet;
	public Row row;
	public Cell cell;

	// get driver
	public void getDriver(String browsweTpye) {

		switch (browsweTpye) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Invalid Browser Type");
			break;
		}
	}

	// Get url
	public void getUrl(String url) {
		driver.get(url);
	}

	// window Maximize
	public void windowMax() {
		driver.manage().window().maximize();
	}

	// Excel read
	public String excelRead(int rownnum, int cellnum) throws IOException {
		// to locate file
		file_Location = new File("DataBase\\bookwagon.xlsx");
		// to get file as input data
		FileInputStream fileInputStream = new FileInputStream(file_Location);
		// define workbook format
		workbook = new XSSFWorkbook(fileInputStream);
		// to get sheet from workbook
		sheet = workbook.getSheet("Sheet1");
		// to get row
		row = sheet.getRow(rownnum);
		// to get cell from row
		cell = row.getCell(cellnum);
		// to define cellType

		CellType cellType = cell.getCellType();
		String value = null;

		switch (cellType) {
		case STRING:
			value = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
				value = simpleDateFormat.format(dateCellValue);
			} else {

				double numericCellValue = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
				value = valueOf.toString();
			}
			break;
		default:
			System.out.println("In Valid Cell Type");
			break;
		}
		return value;
	}

	// Take Screenshot
	public void takeScreenShots() throws IOException {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File targetFile = new File("ScreenShots\\" + System.currentTimeMillis() + ".png");
		FileUtils.copyFile(sourceFile, targetFile);

	}

	// SendKeys
	public void sendKeysByJava(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);
	}

	public void screenWait(long milliSceonds) throws InterruptedException {
		Thread.sleep(milliSceonds);
	}

	// Alert handling

	public void alerthandling() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public void navigation(String commands) {

		switch (commands) {
		case "refresh":
			driver.navigate().refresh();

			break;

		case "forward":
			driver.navigate().forward();

			break;

		case "back":
			driver.navigate().back();

			break;

		default:
			System.out.println("In Valid Commands");
			break;
		}

	}

	public void quit() {
		driver.close();
	}

	public void clickByJS(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}

	public void moveToCursor(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();

	}

	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}

	public void excelReport(int rownum, int columnum, String message) throws IOException {

		FileOutputStream fileOutputStream = new FileOutputStream(file_Location);
		cell = sheet.getRow(rownum).createCell(columnum);
		cell.setCellValue(message);
		workbook.write(fileOutputStream);
	}

}
