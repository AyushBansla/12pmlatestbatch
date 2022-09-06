package JunitPractice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup_page
{
	ChromeDriver driver;
	
	@Before
    public void Uri() throws InterruptedException
    {
		System.setProperty("webdriver.chrome.driver","../Junit_Project/chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("https://www.facebook.com");
		   driver.manage().window().maximize();
		   System.out.println("Chrome open successfully");
		   Thread.sleep(2000);
    }
	@Test
	public void Signup() throws InterruptedException
	{
		WebElement Createaccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		   Createaccount.click();
		   Thread.sleep(2000);
		   
		   System.out.println(driver.getTitle());
		  
		   
		   WebElement FristName=driver.findElement(By.xpath("//input[@name='firstname']"));
		   FristName.sendKeys("Ayush");
           Thread.sleep(2000);
		   
		   WebElement SurName=driver.findElement(By.xpath("//input[@name='lastname' or @id='u_0_d_qG']"));
		   SurName.sendKeys("Bansla");
		   Thread.sleep(2000);
		   
		   WebElement Email=driver.findElement(By.xpath("//*[@name='reg_email__' or @id='u_0_g_uc']"));
		   Email.sendKeys("abc@gmail.com");
		   Thread.sleep(2000); 
		   
		   WebElement re_email=driver.findElement(By.xpath("//input[@*='Re-enter email address']"));
		   re_email.sendKeys("abc@gmail.com");
		   Thread.sleep(2000); 
		   
		   WebElement password=driver.findElement(By.xpath("//input[contains(@id,'password')]"));
		   password.sendKeys("abc@123");
		   Thread.sleep(2000); 
		   
		   WebElement day=driver.findElement(By.id("day"));
		   Select d=new Select(day);
		   d.selectByVisibleText("1");
		   Thread.sleep(2000); 
		   
		   WebElement month=driver.findElement(By.id("month"));
		   Select m=new Select(month);
		   m.selectByIndex(0);
		   Thread.sleep(2000); 
		   
		   WebElement year=driver.findElement(By.id("year"));
		   Select y=new Select(year);
		   y.selectByValue("1994");
		   Thread.sleep(2000); 
		   
		   WebElement gender=driver.findElement(By.xpath("(//input[contains(@id,'u_')])[7]"));
		   gender.click();
		    
		    System.out.println("Successfully filled Signup page");
		  	}
	@After
	public void Close()
	{
		driver.close();
		System.out.println("Chrome closed successfully");
	}
}
