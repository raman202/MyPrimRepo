package google.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebooktestpage {

	public static void main(String[] args) throws Exception  {
		// learning automation again 
		// automate big, complex, feature that need to be tested over and over again 
		// we automate tests for regression tests and smoke tests (run on a regular bases) 
		
		// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
		
			driver.get("http://facebook.com/");
			
			driver.manage().window().maximize();
						
	    // test case create account
		driver.findElement(By.partialLinkText("Create new")).click();
		driver.findElement(By.name("firstname")).sendKeys("raman");
		driver.findElement(By.name("lastname")).sendKeys("paul");
	
// selecting months from drop down.
		WebElement monthDropdown = driver.findElement(By.name("birthday_month"));
		Select monthDropdown1 = new Select(monthDropdown);
		monthDropdown1.selectByVisibleText("Jul");
		
		WebElement dateDropdown = driver.findElement(By.name("birthday_day"));
		Select dateDropdown1 = new Select(dateDropdown);
		dateDropdown1.selectByVisibleText("6");
		
		WebElement yearDropdown = driver.findElement(By.name("birthday_year"));
		Select yearDropdown1 = new Select(yearDropdown);
		yearDropdown1.selectByVisibleText("1987");
		
		
		  WebElement genderButton = driver.findElement(By.xpath("//*[@id=\"sex\"]"));
	        genderButton.click();
		
		
		
		
		
		
	}	

}
