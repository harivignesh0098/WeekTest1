package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UiBank {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://uibank.uipath.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Register For Account")).click();
		driver.findElement(By.id("firstName")).sendKeys("hari");
		WebElement saluation = driver.findElement(By.id("title"));
        Select salutation1 =new Select(saluation);
	    
	    salutation1.selectByValue("mr");
	    
	    driver.findElement(By.id("middleName")).sendKeys("vignesh");
	    driver.findElement(By.id("lastName")).sendKeys("m");
	    driver.findElement(By.id("age")).sendKeys("(09/06/2000)");
	    
	    WebElement dropdown = driver.findElement(By.id("maritalStatus"));
        Select marage =new Select(dropdown);
	    
	    marage.selectByVisibleText("Single");
	    driver.findElement(By.id("username")).sendKeys("hari09");
	    driver.findElement(By.id("email")).sendKeys("hari090600@gmail.com");
	    
	    driver.findElement(By.id("password")).sendKeys("hari");
	    


		//driver.close();
	}
}
