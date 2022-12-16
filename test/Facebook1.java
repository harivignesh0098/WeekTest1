package test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Facebook1 
{

		public static void main(String[] args) 
		{
		
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("hari");
		
		    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("hari vignesh");
		    
		    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("hari090600@gmail.com");
		    
		    driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("#hari00");
		    
		    driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("hari090600@gmail.com");
		
		    WebElement date =driver.findElement(By.id("day"));
		    
		    Select date1 =new Select(date);
		    
		    date1.selectByValue("9");
		    
		    WebElement month =driver.findElement(By.id("month"));
		    
		    Select month1 = new Select(month);
		    
		    month1.selectByVisibleText("Jun");
		    
		    WebElement year =driver.findElement(By.id("year"));
		    
		    Select year1=new Select(year);
		    
		    year1.selectByValue("2000");
		    
		    driver.findElement(By.xpath("//label[text()='Male']")).click();
		    
		}
}
