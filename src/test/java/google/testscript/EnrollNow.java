package google.testscript;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnrollNow {

	public static void main(String[] args) throws Exception  {
		
		// automate big, complex, feature that need to be tested over and over again 
		// we automate tests for regression tests and smoke tests (run on a regular bases) 
		
		// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
		
			driver.get("https://agile1test.com");
			driver.manage().window().maximize();
			driver.navigate().to("https://www.google.com/");
		    driver.navigate().back();
		    
		    
		//	as a user i want to enroll 		
			driver.findElement(By.partialLinkText("Enroll ")).click();
			
		// Fill enrollment form 			
			driver.findElement(By.name("first_name")).sendKeys("Raman");
			driver.findElement(By.id("last_name")).sendKeys("Paul");
			driver.findElement(By.name("phone")).sendKeys("7032224444");
			driver.findElement(By.id("street")).sendKeys("111 tester street");
			driver.findElement(By.id("city")).sendKeys("fiarfax");
			driver.findElement(By.name("state")).sendKeys("V");
			driver.findElement(By.name("postalCode")).sendKeys("20109");
			
			WebElement countryDropdownElement = driver.findElement(By.name("country"));
			Select countryDropdown = new Select(countryDropdownElement);
			countryDropdown.selectByVisibleText("United States");

			driver.findElement(By.id("email")).sendKeys("rpaul100@test.com");
			driver.findElement(By.id("password")).sendKeys("test01$");
			driver.findElement(By.id("confirm_password")).sendKeys("test01$");

			WebElement selectCourseDropdown = driver.findElement(By.name("role"));
			Select selectCourse = new Select(selectCourseDropdown);
			selectCourse.selectByVisibleText("QA Automation");
			// find terms check box
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement tncCheckbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("t&c")));

			// Scroll to it
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", tncCheckbox);
			Thread.sleep(500);

			// Now click
			tncCheckbox.click();
			
			WebElement enrollButton = driver.findElement(By.cssSelector(".btn.btn-primary"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", enrollButton);
			Thread.sleep(500);
			//enrollButton.click();	
			
			 // Locate the warning message element
	        WebElement warning = driver.findElement(By.id("passwordStrengthMessage"));
			
	        if (warning.isDisplayed()) {
	            System.out.println("Password warning is displayed: " + warning.getText());
	        } else {
	            System.out.println("Warning is NOT displayed.");
	        }
	        
			driver.navigate().to("https://www.google.com/");
	
			String currentUrl = driver.getCurrentUrl();
			System.out.println("Current URL is: " + currentUrl);
			
			driver.getTitle(); 
			Thread.sleep(Duration.ofSeconds(2));
	     	driver.close();
			 
	     
			
	}

}

			