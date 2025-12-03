package UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class UtilityClass extends BaseClass {
	String text;

	WebElement mobileName;

	public static String getTD(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(
				"E:\\ATTCucumberBDD\\SeleniumFramework\\AngleBrokingFrameWork\\src\\test\\resources\\Excel Sheet\\UserIdandPass.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;

	}

	public void backButton() {
		driver.navigate().back();
	}

	public static void verifyName(WebElement ele, String text) {
	
		String actualAllText = ele.getText();
		String actualText =actualAllText.substring(0,actualAllText.indexOf("|")).trim();
		System.out.println("actualNameted= " + actualText);
		String expectedtext = text;
		if (actualText.equals(expectedtext)) {
			System.out.println("Name Is Showing Correct is not show");
		}else {
			System.out.println("Name Is Showing InCorrect");
		}
		Assert.assertEquals(actualText, expectedtext);
	

	}
	
	/*public static void verifyPriseaAllMackbook(List<WebElement> allPrise) {
		for(WebElement prise:allPrise) {
			int tempprise=0;
			String priseText=prise.getText().replaceAll("[,]", "").trim();
			
			
		/if(priseText.isEmpty()) continue;
		int maxPrise=Integer.parseInt(priseText);
		if(maxPrise<5000 || maxPrise>10000) {
			throw new AssertionError("")
		}
			
			
		}*/
		
	
	
	
	

}
