package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sabarinathan");
		driver.findElement(By.name("lastname")).sendKeys("P");
		driver.findElement(By.name("reg_email__")).sendKeys("85086063XX");
		driver.findElement(By.id("password_step_input")).sendKeys("Sabari12");
		
		WebElement Day= driver.findElement(By.id("day"));
		Select fb = new Select(Day);
		fb.selectByVisibleText("12");
		
		WebElement Month= driver.findElement(By.id("month"));
		Select fb1 = new Select(Month);
		fb1.selectByIndex(11);
		
		WebElement Year= driver.findElement(By.id("year"));
		Select fb2 = new Select(Year);
		fb2.selectByValue("1994");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
			
		
	}

}
