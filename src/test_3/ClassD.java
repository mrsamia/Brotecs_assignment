package test_3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClassD {

	public static void main(String[] args) {
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.selenium.dev/\r\n");
	 System.out.println("Page successfully loaded");
	 
	 driver.findElement(By.id("aboutArrow")).click();
	System.out.println("About click successfully done");
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("aboutArrow")));
	
	driver.findElement(By.linkText("About")).click();
	System.out.println("Again About click successfully done");
	
	 String myText = driver.findElement(By.className("body-large")).getText();
     System.out.println("Print the text:  " + myText);
     
    driver.navigate().back();   
	}

}
